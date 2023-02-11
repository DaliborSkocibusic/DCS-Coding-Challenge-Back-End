package BackendApplication.SpringBackend;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import controller2.*;

// Source: https://www.programiz.com/java-programming/packages-import

// Need to add controllers in seperater packages.. Maybe. 

@SpringBootApplication
@RestController
@CrossOrigin(maxAge = 3600)
public class SpringBackendApplication {

	@RequestMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}
	
	@GetMapping(path="/")
	public List<String> hello() {
		return List.of("Hell", "world");
	}

}
