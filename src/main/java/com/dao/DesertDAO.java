package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Desert;



@Service
public class DesertDAO {
	@Autowired
	DesertRepository desertRepository;
	
	public List<Desert> getAllDesert() {
		List<Desert> prodList = desertRepository.findAll();
		return prodList;
	}

	public Desert getProduct(int prodId) {
		return desertRepository.findById(prodId).orElse(null);
	}

	public Desert getProdByName(String prodName) {
		return desertRepository.findByName(prodName);
	}

	public Desert register(Desert product) {
		return desertRepository.save(product);
	}

	public Desert updateProduct(Desert product) {
		return desertRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		desertRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}
}
