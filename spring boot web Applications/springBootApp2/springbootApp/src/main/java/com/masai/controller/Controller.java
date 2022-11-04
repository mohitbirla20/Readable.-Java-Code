package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/helloo")
public class Controller {

	@RequestMapping("/hello")
	public String hello() {
		return "hrllo";
	}
	
	@RequestMapping("/student/{r}")
	public Student getStudent(@PathVariable("r") Integer roll) {
		return new Student(roll, "Mohit Birla" ,498);
	}
	
	
	//http://localhost:8080/students?r=45
	//http://localhost:8080/students?r=45&name=mohit
	@GetMapping("/students")
	public Student getStudent2(@RequestParam("r") Integer r,@RequestParam(value="name",required = false) String name) {
		return new Student(r,name,489);
	}
	
	
	//http://localhost:8080/studentss/45?name=mohit
	@GetMapping("/studentss/{roll}")
	public Student getStudent3(@PathVariable("roll") Integer r , @RequestParam(value="name",required = false) String name) {
		return new Student(r,name,899);
	}
	
	
	//last 15 minutes remaning.
		
}
