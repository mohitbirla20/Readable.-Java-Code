package com.masau.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masau.exception.InvalidIdException;

@RestController
public class MyController {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/hello2/{id}")
	public ResponseEntity<String> sayValue(@PathVariable("id") Integer id){
		
		if(id>10)
			return new ResponseEntity<String>("Id is Greater then 10",HttpStatus.ACCEPTED);
		else
			throw new IllegalArgumentException("id should not less then 10");
		
	}
	
	
	//userDefind Exception.
	@GetMapping("/hello3/{id}")
	public ResponseEntity<String> sayValue3(@PathVariable("id") Integer id) throws InvalidIdException{
		
		if(id>10)
			return new ResponseEntity<String>("Id is Greater then 10",HttpStatus.ACCEPTED);
		else
			throw new InvalidIdException("id should not less then 10");
		
	}
	
	
	//in our application illegalArgumentException occurs this method will be called ..
    //this method will work for only this class method we can not use this to other 
	//any other controller so for that we have to create one other class to use this
	//methid global.
	/*
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> myExceptionHandler(IllegalArgumentException ie){
		return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
	}
	*/
	
	
}
