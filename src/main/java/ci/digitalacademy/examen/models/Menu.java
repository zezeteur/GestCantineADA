package ci.digitalacademy.examen.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Entity
@Setter
@Table(name = "menu")
public class Menu {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date")
    private Date creation_date;

    @OneToOne
    @JoinColumn(name = "plat_id")
    private  Plat plat;;
}

