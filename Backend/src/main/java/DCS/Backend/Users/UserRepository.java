package DCS.Backend.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import DCS.Backend.*;

public interface UserRepository extends JpaRepository<User, Long> {

}
