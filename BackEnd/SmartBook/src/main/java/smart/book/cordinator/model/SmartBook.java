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
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "idReseau")
    private ReseauxSociaux reseauxSociaux;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "idPosition" )
    private Position position;


}
