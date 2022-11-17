package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

import masai.com.exception.StudentException;

public class StudentDetailByRoll {

      public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter student roll");
        int roll = sc.nextInt();
        
        StudentDao dao =new StudentDaoImpl();
        try {
			Student student = dao.getStudentByRoll(roll);
			System.out.println(student);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
        
        
        
	}

}
