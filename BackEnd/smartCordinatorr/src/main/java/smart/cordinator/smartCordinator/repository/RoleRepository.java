package smart.cordinator.smartCordinator.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import smart.cordinator.smartCordinator.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String Name);
}