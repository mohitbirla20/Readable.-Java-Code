package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hello")
	public String getHello() {
		return "Welcome to spring boot";
	}
	
	
	@RequestMapping("/employee")
	public Employee getEmployee() {
		return new Employee(12,"Mohit Birla",70000);
	}
	
	
	@RequestMapping("/employees")
	public List<Employee> getEmployeeList(){
		
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(12,"Mohit Birla" , 70000));
		emps.add(new Employee(13,"Vanshika Birla" , 75000));
		emps.add(new Employee(14,"Ram Patel" , 6000));
		emps.add(new Employee(15,"Rohit Saliya" , 65000));
		emps.add(new Employee(16,"Vikash shah" , 40000));
		emps.add(new Employee(17,"vanshuu Birla" , 7800));

		return emps;
	}
	
}
