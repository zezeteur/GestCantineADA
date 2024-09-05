package ci.digitalacademy.examen.controller;


import ci.digitalacademy.examen.models.Menu;
import ci.digitalacademy.examen.services.PlatService;
import ci.digitalacademy.examen.services.dto.PlatDTO;
import ci.digitalacademy.examen.services.dto.PlatDTO;
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
@RequestMapping("/plat")
@RequiredArgsConstructor
@Slf4j
public class PlatController {

    public final PlatService platService;

    @GetMapping
    public String showPlatPage(Model model) {
        List<PlatDTO> plats = platService.findAll();
        model.addAttribute("plats", plats);
        return "/plat/plats";
    }

    @PostMapping
    public String savePlat(PlatDTO platDTO){
        log.debug("Request to save plat :{}", platDTO);
        platService.save(platDTO);
        return "redirect:/plat";
    }

    @GetMapping("/{id}")
    public String showUpdatePlatForm(Model model, @PathVariable(name = "id") Long id) {
        log.debug("Request to show update plat forms");
        Optional<PlatDTO> plat = platService.findOne(id);
        if (plat.isPresent()){
            model.addAttribute("plat", plat.get());
            return "plat/forms";
        } else {
            return "redirect:/plat";
        }
    }

    @GetMapping("/add")
    public String showAddPlatPage(Model model) {
        log.debug("Request to show add plat forms");
        model.addAttribute("plat", new Menu());
        return "/plat/forms";
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deletePlat(@PathVariable(name = "id") Long id) {
        try {
            platService.delete(id);
            return new ResponseEntity<>("Plat deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting plat", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
