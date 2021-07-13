package com.learn.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.learn.jpa.model.Intern;

public interface InternRepository extends JpaRepository<Intern	, Integer>{
	
	List<Intern> findByInternName(String internName);
	
	
	@Query("from Intern order by internName")
	List<Intern> orderByName();

}