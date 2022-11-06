package com.masau.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IllegalException {

	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> myExceptionHandler(IllegalArgumentException ie){
		return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(InvalidIdException.class)
	public ResponseEntity<String> getMassageForIlvalidId(InvalidIdException id){
		return new ResponseEntity<String>(id.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
