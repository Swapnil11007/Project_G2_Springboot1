package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.ProductHS;

@Service
public class ProductHSDAO {

	@Autowired
	ProductHSRepository productHSRepository;
	
	public List<ProductHS> getAllProducts() {
		List<ProductHS> prodList = productHSRepository.findAll();
		return prodList;
	}

	public ProductHS getProduct(int prodId) {
		return productHSRepository.findById(prodId).orElse(null);
	}

	public ProductHS getProdByName(String prodName) {
		return productHSRepository.findByName(prodName);
	}

	public ProductHS register(ProductHS product) {
		return productHSRepository.save(product);
	}

	public ProductHS updateProduct(ProductHS product) {
		return productHSRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		productHSRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}
	
}
