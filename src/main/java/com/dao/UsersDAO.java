package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Users;

@Service
public class UsersDAO {

	@Autowired
	UsersRepository usersRepository;
	Users user;
	
	public Users usersLogInDao(String emailId, String password) {		
		return usersRepository.usersLogInRepo(emailId, password);
	}
	
	public Users registerUserDao(Users user) {
		
		this.user = usersRepository.getUsersEmailId(user.getEmailId());
		if(this.user==null)
			return usersRepository.save(user);
		return new Users(-1, null, null, null, null);
	}

	public String updatePasswordDao(String emailId, String password) {
		
		usersRepository.updatePasswordRepo(emailId,password);
		return "Password Updated";
	}
}