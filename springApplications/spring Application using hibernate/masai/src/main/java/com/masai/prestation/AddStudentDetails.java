package com.masai.prestation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.entity.Collage;
import com.masai.entity.Student;
import com.masai.service.StudentService;

@Controller
public class AddStudentDetails {

	@Autowired
	StudentService sService;
	
	public String addStudentDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Student name");
		String name = sc.next();
		
		System.out.println("enter Student marks");
		int marks = sc.nextInt();
		
		Student s = new Student();
		s.setName(name);
		s.setMakrs(marks);
		
		
		return sService.saveStudent(s);
		
	}
	
	
    public  String addCollage() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter collage name");
		String name = sc.next();
		
		System.out.println("enter location");
		String location  = sc.next();
		
		Collage collage = new Collage();
		collage.setName(name);
		collage.setLocation(location);
		
	   return  sService.saveCollage(collage);
	}
	
    
    public String assignCollage() {
    
    	Scanner sc = new Scanner(System.in);
		System.out.println("enter Student name");
		String name = sc.next();
		
		System.out.println("enter Student marks");
		int marks = sc.nextInt();
		
		Student s = new Student();
		s.setName(name);
		s.setMakrs(marks);
		
		
		return sService.assignCollage(s);

    }
	
}
