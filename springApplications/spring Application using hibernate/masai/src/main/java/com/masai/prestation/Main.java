package com.masai.prestation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
	    AddStudentDetails obj = ctx.getBean("addStudentDetails",AddStudentDetails.class);
		
	  //  System.out.println(obj.addStudentDetails());
	    
	  //  System.out.println(obj.addCollage());
	    
	    System.out.println(obj.assignCollage());
	}
	
}
