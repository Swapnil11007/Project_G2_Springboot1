package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Users;

@Service
public class UsersDAO {

	@Autowired
	UsersRepository usersRepository;
	
	public Users getUsers(String emailId, String password) {		
		return usersRepository.getUsers(emailId, password);
	}
	
	public Users registerUsers(Users user) {
		return usersRepository.save(user);
	}
}
