package com.masau.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class InvalidIdException extends Exception {

	public InvalidIdException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidIdException(String massage){
		super(massage);
	}
	
}
