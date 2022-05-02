package smart.book.cordinator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SmartBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartBookApplication.class, args);

	}
	@Bean
	BCryptPasswordEncoder passwordEncoder(){
		return  new BCryptPasswordEncoder();
	}

}
