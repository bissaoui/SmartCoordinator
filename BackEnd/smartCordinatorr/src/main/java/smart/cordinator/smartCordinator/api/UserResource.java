package smart.cordinator.smartCordinator.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import smart.cordinator.smartCordinator.models.User;
import smart.cordinator.smartCordinator.service.UserService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {

	@Autowired
	private UserService userService;
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUser(){
		return ResponseEntity.ok().body(userService.getUsers());
	}
	
}
