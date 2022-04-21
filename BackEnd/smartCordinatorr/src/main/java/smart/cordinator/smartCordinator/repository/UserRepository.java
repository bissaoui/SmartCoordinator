package smart.cordinator.smartCordinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import smart.cordinator.smartCordinator.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String Username);
}
