package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Snow;

@Service
public class SnowDAO {
	@Autowired
	SnowRepository snowRepository;
	
	public List<Snow> getAllSnowsites() {
		List<Snow> prodList = snowRepository.findAll();
		return prodList;
	}

	public Snow getProduct(int prodId) {
		return snowRepository.findById(prodId).orElse(null);
	}

	public Snow getProdByName(String prodName) {
		return snowRepository.findByName(prodName);
	}

	public Snow register(Snow product) {
		return snowRepository.save(product);
	}

	public Snow updateProduct(Snow product) {
		return snowRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		snowRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}
}
