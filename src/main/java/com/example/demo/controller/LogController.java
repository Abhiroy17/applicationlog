package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LogModel;
import com.example.demo.service.LogService;
import java.util.*;

@RestController
public class LogController {
	@Autowired
	private LogService logservice;
	@Autowired
	LogModel logModel;
	
	@GetMapping("/checkIn")
	public void addCheckin(@RequestParam String name) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
	    Date dt = new Date();
	    String string=formatter.format(dt);
	    String dateTime[] = string.split(" ");
	    String date=dateTime[0].toString();
	    String time=dateTime[1].toString();
	    logModel.setDate(date);
	    logModel.setTime(time);
	    logModel.setName(name);
	    logModel.setId(name+time);
	    logModel.setLogType("IN");
		 logservice.saveLogModel(logModel);
		
	}
	
	@GetMapping("/checkOut")
	public void addCheckout(@RequestParam String name) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
	    Date dt = new Date();
	    String string=formatter.format(dt);
	    String dateTime[] = string.split(" ");
	    String date=dateTime[0].toString();
	    String time=dateTime[1].toString();
	    logModel.setDate(date);
	    logModel.setTime(time);
	    logModel.setName(name);
	    logModel.setId(name+time);
	    logModel.setLogType("OUT");
		 logservice.saveLogModel(logModel);
		
	}
	@GetMapping("/getLog")
	public List<LogModel> getByDate(@RequestParam String date) {
		
		
		return logservice.getLogModel(date);
		
	}
	@GetMapping("/getAllLog")
	public List<LogModel> getALl() {
		
		
		return logservice.getAllLogModels();
		
	}
	
	
	
}
