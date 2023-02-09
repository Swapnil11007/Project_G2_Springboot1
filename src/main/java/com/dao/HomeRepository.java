package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.model.Home;

@Repository
public interface HomeRepository extends JpaRepository <Home, Integer>{

//	@Query("from Home p where p.beachName = :beachName")
//	Home findByName(@Param("beachName") String beachName);
	
	@Query("from Home order by rating DESC")
	List<Home> findByRating();
	
}
