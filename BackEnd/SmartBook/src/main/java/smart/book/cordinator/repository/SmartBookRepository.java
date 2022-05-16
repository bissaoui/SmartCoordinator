package smart.book.cordinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.book.cordinator.model.Position;
import smart.book.cordinator.model.SmartBook;

import java.util.List;

public interface SmartBookRepository extends JpaRepository<SmartBook,Long> {
    List<SmartBook> findSmartBookByUser_Id(Long i);
}
