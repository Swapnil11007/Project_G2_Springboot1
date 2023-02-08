package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.BeachDAO;
import com.model.Beach;

@RestController
public class BeachController {
	@Autowired	//Dependency Injection
	BeachDAO beachDAO;

	@RequestMapping("/showAllBeach")
	public List<Beach> showAllBeach() {
		List<Beach> prodList = beachDAO.getAllBeach();
		return prodList;
	}
}
