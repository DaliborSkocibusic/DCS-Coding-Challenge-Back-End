package DCS.Backend.Users;


import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController

// This is what happens when we enter localhost:8080/user
@CrossOrigin(origins= {"*"}, maxAge = 4800, exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService service;

	// This is what happens when we enter localhost:8080/user with a get request. 
	// JSON will be ignored
   @CrossOrigin(origins= {"*"}, maxAge = 4800 )

	@GetMapping
	public ResponseEntity<List<User>> all() {
		List<User> allUser = this.service.all();
		return new ResponseEntity<>(allUser, HttpStatus.OK);
	}

	// This is what happens when we enter localhost:8080/user/2 with a get request. 
	// JSON will be ignored
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		Optional<User> maybeUser = this.service.findById(id);

		if (maybeUser.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(maybeUser.get(), HttpStatus.OK);

	}

	// This is what happens when we enter localhost:8080/user/5/full-heal with a post request. 
	// JSON will be ignored. 
	
	@PostMapping("/{id}")
	public ResponseEntity<User> findAndUpdate(@PathVariable Long id) {
		Optional<User> isExistingUser = this.service.findById(id);

		if (isExistingUser != null ) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

//	@PostMapping("/attack")
//	public ResponseEntity<User> attack(@Valid @RequestBody UserAttackDTO data) {
//		boolean isSuccess = this.service.attack(data.getAttackerId(), data.getVictimId());
//
//		if (isSuccess) {
//			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
//		}
//		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//
//	}

	// This is what happens when we enter localhost:8080/user with a post request. 
	// JSON will be need to be correct, bad JSON = 400 bad request error. 
	@PostMapping
	public ResponseEntity<User> create(@Valid @RequestBody UserCreateDTO data) {

		User createdUser = this.service.create(data);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

	// This is what happens when we enter localhost:8080/user with a delete request. 
	// JSON will be ignored. No content 204 if successful. 404 otherwise. 
	@DeleteMapping("/{id}")
	public ResponseEntity<User> delete(@PathVariable Long id) {
		boolean isDeleted = this.service.delete(id);

		if (isDeleted) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

}
