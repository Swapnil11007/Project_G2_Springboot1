package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Piligrimage;

@Repository
public interface PiligrimageRepository extends JpaRepository <Piligrimage, Integer> {

	@Query("from Piligrimage p where p.piligrimName = :piligrimName")
	Piligrimage findByName(@Param("piligrimName") String piligrimName);
	
}

