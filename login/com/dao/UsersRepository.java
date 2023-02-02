package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	@Query("from Users e where e.emailId = :emailId and e.password = :password")
	Users getUsers(@Param("emailId") String emailId, @Param("password") String password);

}