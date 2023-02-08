package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Safari;

@Service
public class SafariDAO {
	@Autowired
	SafariRepository safariRepository;
	
	public List<Safari> getAllSafari() {
		List<Safari> prodList = safariRepository.findAll();
		return prodList;
	}

	public Safari getProduct(int prodId) {
		return safariRepository.findById(prodId).orElse(null);
	}

	public Safari getProdByName(String prodName) {
		return safariRepository.findByName(prodName);
	}

	public Safari register(Safari product) {
		return safariRepository.save(product);
	}

	public Safari updateProduct(Safari product) {
		return safariRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		safariRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}
}
