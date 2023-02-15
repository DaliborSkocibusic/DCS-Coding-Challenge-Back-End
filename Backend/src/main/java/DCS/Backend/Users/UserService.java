package DCS.Backend.Users;


import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@Transactional
@CrossOrigin(origins= {"*"}, maxAge = 4800, exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})

public class UserService {

	@Autowired
	private UserRepository repository;

	public User create(UserCreateDTO data) {
		String cleanedFirstName = data.getFirstName().trim();
		String cleanedLastName = data.getLastName().trim();

		String cleanedMiddleName = data.getMiddleName().trim();
		Integer contractLength = data.getContractLength();
		String cleanedEmailAddress = data.getEmailAddress().trim();

		User newUser = new User(cleanedFirstName, cleanedLastName, cleanedMiddleName, contractLength, cleanedEmailAddress);
		this.repository.save(newUser);
		return newUser;
	}

	public List<User> all() {
		return this.repository.findAll();
	}

	public Optional<User> findById(Long id) {
		return this.repository.findById(id);
	}

	public boolean delete(Long id) {
		Optional<User> maybeUser = this.findById(id);

		if (maybeUser.isEmpty())
			return false;
		this.repository.delete(maybeUser.get());
		return true;
	}

	
	// This doesnt work. Right now it just creates a new user. 
	public boolean findAndUpdate(Long id, User data) {
		Optional<User> maybeUser = this.findById(id);

		if (maybeUser.isEmpty()) {
			return false;
		}

		User updatedUser = data;
		this.repository.save(updatedUser);
		return true;
	}

}
