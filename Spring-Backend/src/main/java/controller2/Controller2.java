// Java Program to Illustrate DemoController
 
// Importing package to code module
package controller2;
import org.springframework.web.bind.annotation.GetMapping;
// Importing required classes
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 


// Annotation
@RestController
@RequestMapping(path = "/hello6")
 
// Class
public class Controller2 {
 
//    @ResponseBody
 
    // Method
    @GetMapping(path = "/hello2")
    public String helloWorld()
    {
 
        // Print statement
        return "Hello World!";
    }
}