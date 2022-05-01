package smart.book.cordinator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String username;
    private String prenom;
    private String email;
    private String password;
    private Date ddn;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles =new ArrayList<>();


    public User(int id, String nom, String username, String prenom, String email, String password, Date ddn) {
        this.id = id;
        this.nom = nom;
        this.username = username;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.ddn = ddn;
    }
}
