package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Adventure;


@Repository
public interface AdventureRepository extends JpaRepository <Adventure, Integer>{
	@Query("from Adventure p where p.adventureName = :adventureName")
	Adventure findByName(@Param("adventureName") String adventureName);


}
