package com.masai.usecases;

import java.util.List;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

import masai.com.exception.StudentException;

public class AllStudents {

	public static void main(String[] args) {
       StudentDao dao = new StudentDaoImpl();
       
        try {
			List<Student> students = dao.getAllDetails();
			students.forEach(s->System.out.println(s));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
        
	}

}
