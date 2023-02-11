// Java Program to Illustrate DemoController
 
// Importing package to code module
package BackendApplication.SpringBackend;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// Importing required classes
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 


// Annotation
@RestController
 
// Class
/*
 * @RequestMapping(path="hello2")
 */public class Sbacontroller {
	/*
	 * private Repository repository;
	 */
	
	// Addin service breaks it.. 
	/*
	 * @Autowired 
	 */
	private DTOService service;
	
	
	@RequestMapping(path="/hello3") // Request mapping needs to be in here or it doesnt resovle.
	// But when entering the repo it says its not allowed.. ill try constructor
	/* https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
	 */ 
	
	
	/*
	 * public void SbaController(Repository repository) { this.repository =
	 * repository; }
	 */
	
    @ResponseBody
 
    // Method
//    @GetMapping(path="/123")
    public String helloWorld()
    {
 
        // Print statement
        return "Hello World!";
    }
	
//	@RequestMapping("/build")
	
	// Changed API to json. Got 415 Error. 
	
	// https://www.baeldung.com/spring-415-unsupported-mediatype
	
//	@PostMapping(value = "/build", consumes = {"text/plain"})
	
	@PostMapping
	public String create(@Valid @RequestBody CreateDTO data) {
		
		return "In here";
		
		
//		DTO createdPokemon = this.service.create(data);
//		return new ResponseEntity<>(createdPokemon, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<DTO> delete(@PathVariable Long id) {
		boolean isDeleted = this.service.delete(id);

		if (isDeleted) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
}