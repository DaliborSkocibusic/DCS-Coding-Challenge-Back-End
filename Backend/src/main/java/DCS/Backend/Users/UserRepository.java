package DCS.Backend.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import DCS.Backend.*;
@CrossOrigin(origins= {"*"}, maxAge = 4800, exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})

public interface UserRepository extends JpaRepository<User, Long> {

}
