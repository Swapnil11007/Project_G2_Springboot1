package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UsersDAO;
import com.model.Users;

@RestController
public class UsersController {
	
	@Autowired
	UsersDAO usersDAO;
	
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody Users user) {

		Users emp = usersDAO.registerUserDao(user);

		if ( emp.getUserId()!=-1 && emp != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@GetMapping("/getUser/{emailId}/{password}")
	public Users userLogIn(@PathVariable("emailId") String emailId, @PathVariable("password") String password) {
		return usersDAO.usersLogInDao(emailId, password);
	}
	
	@PutMapping("/updatePassword/{emailId}/{password}")
	public String updatePassword(@PathVariable("emailId") String emailId, @PathVariable("password") String password){
		return usersDAO.updatePasswordDao(emailId, password);
	}
}
