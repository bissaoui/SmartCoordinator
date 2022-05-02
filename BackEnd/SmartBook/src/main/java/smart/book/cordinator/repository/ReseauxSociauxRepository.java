package smart.book.cordinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.book.cordinator.model.Position;
import smart.book.cordinator.model.ReseauxSociaux;

public interface ReseauxSociauxRepository extends JpaRepository<ReseauxSociaux,Long> {
}
