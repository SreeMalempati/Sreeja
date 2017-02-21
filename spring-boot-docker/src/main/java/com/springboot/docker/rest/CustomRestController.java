/**
 * 
 */
package com.springboot.docker.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.docker.model.User;

@RestController
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class CustomRestController {
	 
	    User user = new User();
	    @RequestMapping(value = "/{name}", 
	    		method = RequestMethod.GET)
	    public @ResponseBody User getEmployeeInJSON(
	    		@RequestParam(value = "firstname", required = false, defaultValue = "Sreeja") String firstname,
				@RequestParam(value = "lastname", required = false, defaultValue = "Malempati") String lastname,
				@RequestParam(value = "email", required = false, defaultValue = "sreeja.jdk@gmail.com") String email,
				@RequestParam(value = "phone", required = false, defaultValue = "3213120869") String phone) {
	 
	   	 user.setEmailId(email);
	   	 user.setFirstName(firstname);
	   	 user.setLastName(lastname);
	   	 user.setPhone(phone);
	   	 
	   	 return user;
	 
	    }
}
