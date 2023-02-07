package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	@Query("from Users e where e.emailId = :emailId and e.password = :password")
	Users usersLogInRepo(@Param("emailId") String emailId, @Param("password") String password);
	
	@Query("from Users e where e.emailId = :emailId and e.password = :password")
	Users getUsers(@Param("emailId") String emailId, @Param("password") String password);

	@Modifying
	@Transactional
	@Query("update Users e set e.password=:password where e.emailId=:emailId")
	int updatePasswordRepo(@Param("emailId") String emailId, @Param("password") String password);
	
	@Query("from Users e where e.emailId=:emailId")
	Users getUsersByEmailId(@Param("emailId") String emailId);
}
