package smart.book.cordinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import smart.book.cordinator.model.Position;
import smart.book.cordinator.model.SmartBook;

import java.util.List;

public interface SmartBookRepository extends JpaRepository<SmartBook,Long> {
    List<SmartBook> findSmartBookByUser_Id(Long i);

    @Query(value = "SELECT sb.* "
            + " FROM user_scannedsb sc ,smart_book sb "
            + " WHERE sc.s_id_smart=sb.id_smart and"
            + " sc.u_id= ?1"
            ,nativeQuery = true)
    List<SmartBook> scanedbyme(Long id);
}
