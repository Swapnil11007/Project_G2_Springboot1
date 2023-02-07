package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.model.Users;

@Service
public class UsersDAO {

	@Autowired
	UsersRepository usersRepository;
	Users user;
	
	public Users usersLogInDao(String emailId, String password) {	
		BCryptPasswordEncoder bcrypt =new BCryptPasswordEncoder();
		this.user = usersRepository.getUsersByEmailId(emailId);
		String encryptedPwd=bcrypt.encode(password);

//		System.out.printf(bcrypt.matches(password, this.user.getPassword()));
//		user.setPassword(encryptedPwd);
		if(bcrypt.matches(password,this.user.getPassword()))
			return usersRepository.usersLogInRepo(emailId, this.user.getPassword());
//			return new Users(-1, "success", null, null, null);
		return new Users(-1, null, null, null, null);
	}
	
//	public Users getUsers(String emailId, String password) {		
//		return usersRepository.getUsers(emailId, password);
//	}
//	
	public Users registerUserDao(Users user) {
		
		BCryptPasswordEncoder bcrypt =new BCryptPasswordEncoder();
		String encryptedPwd=bcrypt.encode(user.getPassword());
		user.setPassword(encryptedPwd);
		this.user = usersRepository.getUsersByEmailId(user.getEmailId());
		if(this.user==null)
			
			return usersRepository.save(user);
		return new Users(-1, null, null, null, null);
	}

	public String updatePasswordDao(String emailId, String password) {
		
		usersRepository.updatePasswordRepo(emailId,password);
		return "Password Updated";
	}
}