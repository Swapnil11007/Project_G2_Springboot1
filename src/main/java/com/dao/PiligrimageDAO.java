package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Piligrimage;



@Service
public class PiligrimageDAO {
	@Autowired
	PiligrimageRepository piligrimageRepository;
	
	public List<Piligrimage> getAllPiligrimage() {
		List<Piligrimage> prodList = piligrimageRepository.findAll();
		return prodList;
	}

	public Piligrimage getProduct(int prodId) {
		return piligrimageRepository.findById(prodId).orElse(null);
	}

	public Piligrimage getProdByName(String prodName) {
		return piligrimageRepository.findByName(prodName);
	}

	public Piligrimage register(Piligrimage product) {
		return piligrimageRepository.save(product);
	}

	public Piligrimage updateProduct(Piligrimage product) {
		return piligrimageRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		piligrimageRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}
}
