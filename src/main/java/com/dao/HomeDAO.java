package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.model.Home;
import com.model.Users;

@Service
public class HomeDAO {
	@Autowired
	HomeRepository homeRepository;
	Home home;

	public List<Home> getAllCategories() {
		List<Home> catList = homeRepository.findAll();
		return catList;
	}

	public List<Home> getAllProdByRating() {
		List<Home> catList = homeRepository.findByRating();
		return catList;
	}

	public Home registerUserDao(Home home) {
//		this.home = homeRepository.getUsersByEmailId(home.getId());
		if(this.home==null)
			return homeRepository.save(home);
		return new Home(-1, null, null, -1, null,null);
	}
}
