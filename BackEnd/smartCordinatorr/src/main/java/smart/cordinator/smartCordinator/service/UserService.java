package smart.cordinator.smartCordinator.service;

import java.util.List;

import smart.cordinator.smartCordinator.models.Role;
import smart.cordinator.smartCordinator.models.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username,String roleName);
	User getUser(String username);
	List<User>getUsers();
}
