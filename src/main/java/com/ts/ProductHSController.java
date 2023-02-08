
package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductHSDAO;
import com.model.ProductHS;

@RestController
public class ProductHSController {
	
	@Autowired	//Dependency Injection
	ProductHSDAO prodHSDAO;

	@RequestMapping("/showAllProducts")
	public List<ProductHS> showAllProducts() {
		List<ProductHS> prodList = prodHSDAO.getAllProducts();
		return prodList;
	}
	
}
	