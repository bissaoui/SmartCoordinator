package smart.book.cordinator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "userScannedsb")
@Entity
@IdClass(userScannedsb.class)
public class userScannedsb  implements Serializable {
    @Id
    private Long uId;
    @Id
    private Long sIdSmart;
}
