package smart.cordinator.smartCordinator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import smart.cordinator.smartCordinator.models.Role;
import smart.cordinator.smartCordinator.models.User;
import smart.cordinator.smartCordinator.repository.RoleRepository;
import smart.cordinator.smartCordinator.repository.UserRepository;

@Service @RequiredArgsConstructor @Transactional @Slf4j @XSlf4j
public class UserServiceImpl implements UserService {
	
	@Autowired
	private  UserRepository userRepository ;
	
	@Autowired
	private  RoleRepository roleRepository ;
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	
	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		User user = userRepository.findByUsername(username);
		Role role = roleRepository.findByName(roleName);
		user.getRoles().add(role);
	}

	@Override
	public User getUser(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
