// Java Program to Illustrate DemoController
 
// Importing package to code module
package BackendApplication.SpringBackend;
import org.springframework.web.bind.annotation.GetMapping;
// Importing required classes
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 


// Annotation
@RestController
 
// Class
public class sbacontroller {
	@RequestMapping(path="/hello3")
 
    @ResponseBody
 
    // Method
//    @GetMapping(path="/123")
    public String helloWorld()
    {
 
        // Print statement
        return "Hello World!";
    }
}