package com.example.demo.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;






@Component
@Entity
@Table(name = "LOG_TABLE")
public class LogModel {
	private String name;
	private String logType;
	private String date;
	private String time;
	@Id
	private String id;
	
	
	
	
	


	
	
	
	
	
	
	/*@Override
	public String toString() {
		return "LogModel [id=" + id + ", name=" + name + ", logType=" + logType + ", date=" + date + ", time=" + time
				+ "]";
	}*/


	/**
	 * @return the id
	 */
	
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the logType
	 */
	public String getLogType() {
		return logType;
	}


	/**
	 * @param logType the logType to set
	 */
	
	public void setLogType(String logType) {
		this.logType = logType;
	}


	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	
	public void setTime(String time) {
		this.time = time;
	}


	public LogModel(String id, String name, String logType, String date, String time) {
		super();
		this.id = id;
		this.name = name;
		this.logType = logType;
		this.date = date;
		this.time = time;
	}


	public LogModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	

	
	
	
	
	
}
