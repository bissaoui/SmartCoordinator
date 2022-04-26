package smart.book.cordinator.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import smart.book.cordinator.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String Name);
}