package DCS.Backend.Users;


import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
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

//	public boolean heal(Long id) {
//		Optional<User> maybeUser = this.findById(id);
//
//		if (maybeUser.isEmpty()) {
//			return false;
//		}
//
//		User foundUser = maybeUser.get();
//		Integer maxHp = foundUser.getHp();
//		foundUser.setRemainingHp(maxHp);
//		this.repository.save(foundUser);
//		return true;
//	}

//	public boolean attack(Long attackerId, Long victimId) {
//
//		if (attackerId == victimId)
//			return false;
//
//		Optional<User> maybeAttacker = this.findById(attackerId);
//		Optional<User> maybeVictim = this.findById(victimId);
//
//		if (maybeAttacker.isEmpty() || maybeVictim.isEmpty()) {
//			return false;
//		}
//
//		User attacker = maybeAttacker.get();
//		User victim = maybeVictim.get();
//
//		// TODO elements logic;
//		Integer remainingHp = victim.getRemainingHp() - attacker.getAttackPower();
//		remainingHp = remainingHp < 0 ? 0 : remainingHp;
//
//		victim.setRemainingHp(remainingHp);
//		this.repository.save(victim);
//		return true;
//
//	}
}
