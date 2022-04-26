package smart.book.cordinator.service;



import java.util.List;

import smart.book.cordinator.model.Role;
import smart.book.cordinator.model.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}