package smart.book.cordinator.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String username;
    private String prenom;
    private String email;
    private String password;
    private Date ddn;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles = new ArrayList<>();


    public User(Long id, String nom, String username, String prenom, String email, String password, Date ddn) {
        this.id = id;
        this.nom = nom;
        this.username = username;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.ddn = ddn;
    }




}
