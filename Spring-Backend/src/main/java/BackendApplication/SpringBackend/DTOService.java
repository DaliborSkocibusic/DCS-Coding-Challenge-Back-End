package BackendApplication.SpringBackend;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Service
@Transactional // Alex used javax transactinoall. not sure if thats a thing.. 
public class DTOService {

//	@Autowired - Dont need for interface
	// Source: https://stackoverflow.com/questions/42907553/field-required-a-bean-of-type-that-could-not-be-found-error-spring-restful-ap
	private final Repository repository = null;
	
	
	public DTO create(CreateDTO data) {
		String cleanedName = data.getName().trim();
		String cleanedElement = data.getElement().trim().toLowerCase();
		// Pokemon(String name, String element, Integer hp, Integer attackPower)
		DTO newDTO = new DTO(cleanedName, cleanedElement, data.getHp(), data.getAttackPower());
		this.repository.save(newDTO);
		return newDTO;
	}

	public Iterable<DTO> all() {
		return this.repository.findAll();
	}
	

	public Optional<DTO> findById(Long id) {
		return this.repository.findById(id);
	}
	
	public boolean delete(Long id) {
		Optional<DTO> maybeDTO = this.findById(id);

		if (maybeDTO.isEmpty())
			return false;
		this.repository.delete(maybeDTO.get());
		return true;
	}
	
	// Source Acles pokemon thing
	// https://github.com/nology-tech/mexico-consultancy/blob/main/code-alongs/spring/mexicospringfull/src/main/java/io/noloy/mexicospringfull/pokemon/PokemonService.java
	
}