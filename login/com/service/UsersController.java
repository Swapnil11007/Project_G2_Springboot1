package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UsersDAO;
import com.model.Users;

@RestController
public class UsersController {
	
	@Autowired
	UsersDAO usersDAO;
	
	@PostMapping("/registerUser")
	public String registerEmployee(@RequestBody Users user) {

		Users emp = usersDAO.registerUsers(user);

		if (emp != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@GetMapping("/getUser/{emailId}/{password}")
	public Users getEmployee(@PathVariable("emailId") String emailId, @PathVariable("password") String password) {
		return usersDAO.getUsers(emailId, password);
	}
}
