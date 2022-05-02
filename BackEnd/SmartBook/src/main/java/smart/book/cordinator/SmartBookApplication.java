package smart.book.cordinator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import smart.book.cordinator.model.Role;
import smart.book.cordinator.model.User;
import smart.book.cordinator.service.UserService;
import java.util.Date;

@SpringBootApplication
public class SmartBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartBookApplication.class, args);

	}
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService)
	{
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			Date date = new Date();
			//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			//date = formatter.format(date)

			userService.saveUser(new User(0L,"Ajana","mehdiajana","Mehdi","mehdi5ajana@gmail.com","1234", date ));
			userService.saveUser(new User(0L,"Bissaoui","yassino","Yassine","yassine.bissaoui@gmail.com","000000", date ));

			userService.addRoleToUser("mehdiajana","ROLE_ADMIN");
			userService.addRoleToUser("mehdiajana","ROLE_MANAGER");
			userService.addRoleToUser("yassino","ROLE_USER");
		};
	}

}
