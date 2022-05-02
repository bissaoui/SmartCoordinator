package smart.book.cordinator.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ReseauxSociaux")

public class ReseauxSociaux {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReseau;
    private String facebook;
    private String linkedin;
    private String whatsapp;
    private String twitter;
    private String instagram;
    private String snapchat;

}
