package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.SafariDAO;
import com.model.Safari;


@RestController
public class SafariController {
	@Autowired	//Dependency Injection
	SafariDAO safariDAO;

	@RequestMapping("/showAllSafari")
	public List<Safari> showAllSafari() {
		List<Safari> prodList = safariDAO.getAllSafari();
		return prodList;
	}
}
