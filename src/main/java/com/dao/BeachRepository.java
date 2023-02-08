package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Beach;


@Repository
public interface BeachRepository extends JpaRepository <Beach, Integer>{
	@Query("from Beach p where p.beachName = :beachName")
	Beach findByName(@Param("beachName") String beachName);


}
