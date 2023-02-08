package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Desert;


@Repository
public interface DesertRepository extends JpaRepository <Desert, Integer>{
	@Query("from Desert p where p.desertName = :desertName")
	Desert findByName(@Param("desertName") String desertName);

}
