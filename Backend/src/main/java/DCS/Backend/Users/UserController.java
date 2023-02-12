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

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> all() {
		List<User> allUser = this.service.all();
		return new ResponseEntity<>(allUser, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		Optional<User> maybeUser = this.service.findById(id);

		if (maybeUser.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(maybeUser.get(), HttpStatus.OK);

	}

	@PostMapping("/{id}/full-heal")
	public ResponseEntity<User> findAndHeal(@PathVariable Long id) {
		boolean isHealed = this.service.heal(id);

		if (isHealed) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	@PostMapping("/attack")
	public ResponseEntity<User> attack(@Valid @RequestBody UserAttackDTO data) {
		boolean isSuccess = this.service.attack(data.getAttackerId(), data.getVictimId());

		if (isSuccess) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

	}

	@PostMapping
	public ResponseEntity<User> create(@Valid @RequestBody UserCreateDTO data) {

		User createdUser = this.service.create(data);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<User> delete(@PathVariable Long id) {
		boolean isDeleted = this.service.delete(id);

		if (isDeleted) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

}
