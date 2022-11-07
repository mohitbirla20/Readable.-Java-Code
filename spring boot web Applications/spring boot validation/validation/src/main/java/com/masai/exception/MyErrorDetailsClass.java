package com.masai.exception;

import java.time.LocalDateTime;

public class MyErrorDetailsClass {

	private LocalDateTime timeStamp;
	private String massage;
	private String description;
	
	
	public MyErrorDetailsClass(LocalDateTime timeStamp, String massage, String description) {
		super();
		this.timeStamp = timeStamp;
		this.massage = massage;
		this.description = description;
	}


	public MyErrorDetailsClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}


	public String getMassage() {
		return massage;
	}


	public void setMassage(String massage) {
		this.massage = massage;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
