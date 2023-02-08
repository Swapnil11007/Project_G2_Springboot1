
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.ProductHS;

@Repository
public interface ProductHSRepository extends JpaRepository <ProductHS, Integer> {

	@Query("from ProductHS p where p.productName = :prodName")
	ProductHS findByName(@Param("prodName") String productName);
	
}

