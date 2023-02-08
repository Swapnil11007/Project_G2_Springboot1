package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Adventure;



@Service
public class AdventureDAO {
	@Autowired
	AdventureRepository adventureRepository;
	
	public List<Adventure> getAllAdventure() {
		List<Adventure> prodList = adventureRepository.findAll();
		return prodList;
	}

	public Adventure getProduct(int prodId) {
		return adventureRepository.findById(prodId).orElse(null);
	}

	public Adventure getProdByName(String prodName) {
		return adventureRepository.findByName(prodName);
	}

	public Adventure register(Adventure product) {
		return adventureRepository.save(product);
	}

	public Adventure updateProduct(Adventure product) {
		return adventureRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		adventureRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}

}
