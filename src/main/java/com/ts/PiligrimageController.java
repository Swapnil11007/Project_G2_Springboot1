package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PiligrimageDAO;
import com.model.Piligrimage;


@RestController
public class PiligrimageController {
	@Autowired	//Dependency Injection
	PiligrimageDAO piligrimageDAO;

	@RequestMapping("/showAllPiligrimages")
	public List<Piligrimage> showAllPiligrimage() {
		List<Piligrimage> prodList = piligrimageDAO.getAllPiligrimage();
		return prodList;
	}
}
