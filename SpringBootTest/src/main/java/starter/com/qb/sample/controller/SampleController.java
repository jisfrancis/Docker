/**
 * 
 */
package starter.com.qb.sample.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abin
 *
 */

@RestController
public class SampleController implements ErrorController{
	
	@RequestMapping("/helloWorld")
	public String testMethod() {
		return "Hi Everyone";
	}
	
	@RequestMapping("/error")
    public String getErrorPath() {
        // TODO Auto-generated method stub
        return "No Mapping Found";
    }

}
