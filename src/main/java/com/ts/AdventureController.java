package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AdventureDAO;
import com.model.Adventure;
import com.model.Beach;



@RestController
public class AdventureController {
	@Autowired	//Dependency Injection
	AdventureDAO adventureDAO;

	@RequestMapping("/showAllAdventure")
	public List<Adventure> showAllAdventure() {
		List<Adventure> prodList = adventureDAO.getAllAdventure();
		return prodList;
	}
	
	@PostMapping("/registerAdenture")
	public String registerCat(@RequestBody Adventure adventure){
		
		Adventure a = adventureDAO.registerUserDao(adventure);

		if ( a.getProdId()!=-1 && a != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
}