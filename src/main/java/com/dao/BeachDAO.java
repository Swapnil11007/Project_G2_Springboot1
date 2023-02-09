package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Beach;
import com.model.Home;



@Service
public class BeachDAO {
	@Autowired
	BeachRepository beachRepository;
	Beach beach;
	
	public List<Beach> getAllBeach() {
		List<Beach> prodList = beachRepository.findAll();
		return prodList;
	}

	public Beach getProduct(int prodId) {
		return beachRepository.findById(prodId).orElse(null);
	}

	public Beach getProdByName(String prodName) {
		return beachRepository.findByName(prodName);
	}

	public Beach register(Beach product) {
		return beachRepository.save(product);
	}

	public Beach updateProduct(Beach product) {
		return beachRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		beachRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}

	public Beach registerUserDao(Beach beach) {
		if(this.beach==null)
			return beachRepository.save(beach);
		return new Beach(-1, null, null,null);
	}

}
