package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.LogModel;
import com.example.demo.repository.LogRepository;
import java.util.List;

@Service
public class LogService {
	@Autowired
	LogRepository repository;
	
	public LogModel saveLogModel(LogModel logModel) {
		return repository.save(logModel);
	}
	
	public List<LogModel> getLogModel(String date){
		return repository.findByDate(date);
	}
	
	public List<LogModel> getAllLogModels(){
		return repository.findAll();
	}
		
	
	

}
