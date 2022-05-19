package smart.book.cordinator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Position")

public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition ;
    private String pays;
    private String ville;
    private Double latitude;
    private Double longitude;
    private String image;
    
    public Double converts(Double lat, Double long)
    {
        return lat+long;
    }
}


