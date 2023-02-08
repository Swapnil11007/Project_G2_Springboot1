package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DesertDAO;
import com.model.Desert;



@RestController
public class DesertController {
	@Autowired	//Dependency Injection
	DesertDAO desertDAO;

	@RequestMapping("/showAllDesert")
	public List<Desert> showAllDesert() {
		List<Desert> prodList = desertDAO.getAllDesert();
		return prodList;
	}
}
