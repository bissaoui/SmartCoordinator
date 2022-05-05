package smart.book.cordinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import smart.book.cordinator.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String Username);

}