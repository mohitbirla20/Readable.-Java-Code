package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetailsClass> myMethodValidation(MethodArgumentNotValidException me) {
		
		MyErrorDetailsClass err = new MyErrorDetailsClass();
		err.setTimeStamp(LocalDateTime.now());
		err.setDescription(me.getBindingResult().getFieldError().getDefaultMessage());
		err.setMassage("validation error");
		
		return new ResponseEntity<MyErrorDetailsClass>(err,HttpStatus.BAD_REQUEST);
	}
	
}
