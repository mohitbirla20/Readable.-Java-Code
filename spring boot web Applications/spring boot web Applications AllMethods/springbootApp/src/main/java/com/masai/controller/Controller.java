package com.masai.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private List<Student> students= new ArrayList<>();
	
    //when ever object we create object the data will be injected in the list.
	public Controller() {
		
		students.add(new Student(10, "Ram", 800));
		students.add(new Student(12, "Amit", 820));
		students.add(new Student(14, "Ravi", 840));
		students.add(new Student(16, "Rajeev", 850));
		students.add(new Student(18, "Vinay", 860));
		
	}
	
	
	// part-3
	/* 
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
	 */
	
	//return massage.
	@GetMapping("/hello")
	public String getName() {
		return "Welcome to springBoot";
	}
	
	
	//get all the students data.
	
	@GetMapping("/students")
	public List<Student> getAllStudentDetailsHandler(){
		return students;
	}
	
	
	//get student by response entity.
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getAllStudentByRoll(@PathVariable("roll") Integer roll){
		
		List<Student> slist = students.stream().filter(s->s.getRoll()==roll).collect(Collectors.toList());
		
		if(slist.size()==0)
			throw new IllegalArgumentException("Student not found");
		
		HttpHeaders hh = new HttpHeaders();
		hh.add("ram", "4000");
		hh.add("ganesh", "7000");
		
		return new ResponseEntity<Student>(slist.get(0),hh,HttpStatus.ACCEPTED);
		
	}
	
	
	
	/*
	@GetMapping("/students/{roll}")
	public Student getStudentByRollHandler(@PathVariable("roll") Integer roll) {
		
		List<Student> list= students.stream().filter(s -> s.getRoll() == roll).collect(Collectors.toList());
		
		if(list.size() == 0)
			throw new IllegalArgumentException("Student does not exist with Roll "+roll);
		
		return list.get(0);
	}
	*/
	
	
	
	/*
	//add students by roll number.
	@PostMapping("/students")
	public String addStudentHandler(@RequestBody Student student) {
		
		students.add(student);
		
		return "Student added Sucessfully..";
				
	}
	*/
	@PostMapping("/students")
	public ResponseEntity<String> addStudentHandler(@RequestBody Student student) {
		students.add(student);
		return new  ResponseEntity<String>("student added succes", HttpStatus.CREATED);
	}
	
	
	@PutMapping("/students/{roll}")
	public String updateStudentHandler1(@RequestBody Student student, @PathVariable("roll") Integer roll) {
		
		boolean flag= true;
		List<Student> slist = students.stream().filter(s->s.getRoll()==roll).collect(Collectors.toList());
		
		if(slist.size()!=0) {
			slist.get(0).setName(student.getName());
			return "students name updated";
		}
		else
			throw new IllegalArgumentException("student not found");
		
	}
	
	
	//delete student by roll.
	@DeleteMapping("/students/{roll}")
	public String deleteStudentByRollHandler(@PathVariable("roll") Integer roll) {
		
		boolean flag= students.removeIf(s -> s.getRoll() == roll);
		
		if(flag)
			return "Student Deleted Successfully";
		else
			throw new IllegalArgumentException("Student not found with Roll "+roll);
	}
	
	
	//give the grace marks by the roll number.
	@PutMapping("/studentmarksupdate/{roll}/{gmarks}")
	public String graceMarksHandler(@PathVariable("roll") Integer roll,@RequestParam("gmarks") Integer gmarks) {
		
		
		boolean flag= true;
		
		for(Student st: students) {
			
			if(st.getRoll() == roll) {	
				st.setMarks(st.getMarks() + gmarks);
				flag = false;
				break;
			}		
			
		}
		
		if(flag)
			throw new IllegalArgumentException("Student does not exist with Roll :"+roll);
			
		
		return "Student marks is Graced successfully..";
		
	}
	
	
	
	
}
