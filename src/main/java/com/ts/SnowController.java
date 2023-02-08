package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.SafariDAO;
import com.dao.SnowDAO;
import com.model.Safari;
import com.model.Snow;

@RestController
public class SnowController {
	
	@Autowired	//Dependency Injection
	SnowDAO snowDAO;

	@RequestMapping("/showAllSnowsites")
	public List<Snow> showAllSnowsites() {
		List<Snow> prodList = snowDAO.getAllSnowsites();
		return prodList;
	}

}
