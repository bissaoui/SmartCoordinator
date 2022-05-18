package smart.book.cordinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import smart.book.cordinator.model.SmartBook;
import smart.book.cordinator.model.userScannedsb;

import java.util.List;

public interface userScannerdsbRepository extends JpaRepository<userScannedsb,Long> {


}
