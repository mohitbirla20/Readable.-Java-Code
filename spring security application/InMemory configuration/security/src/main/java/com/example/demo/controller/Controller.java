package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masai")
public class Controller {

	@GetMapping("/helloo")
	public String helloo(){
		return "hello";
	}
	
	@GetMapping("/userr")
	public String helloUserr() {
		return "hello user";
	}
	
	@GetMapping("/adminn")
	public String helloAdminn() {
		return "hello admin";
	}
	
}
