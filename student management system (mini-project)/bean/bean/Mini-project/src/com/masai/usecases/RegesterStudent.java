package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class RegesterStudent {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter student name");
         String name = sc.next();
         
         System.out.println("Enter student marks");
         int marks = sc.nextInt();
         
         System.out.println("Enter student email");
         String email = sc.next();
         
         System.out.println("Enter password");
         String pass = sc.next();
         
         Student student = new Student(name,marks,email,pass);
         
         StudentDao dao = new StudentDaoImpl();
         String result = dao.regesterStudent2(student);
         
         System.out.println(result);
         
	}

}
