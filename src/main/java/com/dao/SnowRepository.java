package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Snow;


public interface SnowRepository extends JpaRepository <Snow, Integer>{
	@Query("from Snow p where p.snowName = :snowName")
	Snow findByName(@Param("snowName") String snowName);
}