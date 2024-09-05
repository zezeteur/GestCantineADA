package ci.digitalacademy.examen.controller;

import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.services.MenuService;
import ci.digitalacademy.examen.services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/menu")
@RequiredArgsConstructor
@Slf4j
public class MenuController {

    public final MenuService menuService;

    @GetMapping
    public String showMenuPage(Model model) {
        List<MenuDTO> menus = menuService.findAll();
        model.addAttribute("menus", menus);
        return "/menu/menus";
    }


    @PostMapping
    public String saveMenu(MenuDTO menuDTO){
        log.debug("Request to save menu :{}", menuDTO);
        menuService.save(menuDTO);
        return "redirect:/menu";
    }

    @GetMapping("/{id}")
    public String showUpdateMenuForm(Model model, @PathVariable(name = "id") Long id) {
        log.debug("Request to show update menu forms");
        Optional<MenuDTO> menu = menuService.findOne(id);
        if (menu.isPresent()){
            model.addAttribute("menu", menu.get());
            return "menu/forms";
        } else {
            return "redirect:/menu";
        }
    }

    @GetMapping("/add")
    public String showAddMenuPage(Model model) {
        log.debug("Request to show add menu forms");
        model.addAttribute("menu", new Menu());
        return "/menu/forms";
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteMenu(@PathVariable(name = "id") Long id) {
        try {
            menuService.delete(id);
            return new ResponseEntity<>("Menu deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting menu", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}