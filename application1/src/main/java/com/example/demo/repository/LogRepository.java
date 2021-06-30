package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.LogModel;

public interface LogRepository extends JpaRepository<LogModel, String> {
	
	
	@Query(value = "SELECT *  FROM LOG_TABLE WHERE date = ?1", nativeQuery = true)
	public List<LogModel> getLogModel(String date);

	public List<LogModel> findByDate(String date);
	
	
}
