package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Safari;


public interface SafariRepository extends JpaRepository <Safari, Integer>{
	@Query("from Safari p where p.safariName = :safariName")
	Safari findByName(@Param("safariName") String safariName);
}
