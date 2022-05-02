package smart.book.cordinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.book.cordinator.model.Position;

public interface PositionRepository extends JpaRepository<Position,Long> {
}
