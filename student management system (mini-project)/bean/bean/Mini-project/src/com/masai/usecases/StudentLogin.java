package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

import masai.com.exception.StudentException;

public class StudentLogin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student email");
        String email = sc.next();
        
        System.out.println("Enter password");
        String pass = sc.next();
		
        StudentDao dao = new StudentDaoImpl();
           try {
			Student student = dao.loginStudent(email, pass);
			System.out.println("Welcom "+student.getName());
		} catch (StudentException e) {
		    System.out.println(e.getMessage());	
		}
	}

}
