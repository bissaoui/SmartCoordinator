package smart.book.cordinator.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SmartBook")

public class SmartBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSmart;

    private String titre;

    private String adresse;

    private String tele;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idReseau")
    private ReseauxSociaux reseauxSociaux;

    @ManyToOne
    @JoinColumn(name = "idPosition")
    private Position position;


}
