package com.masai.dao;

import java.util.List;
import com.masai.bean.Student;
import masai.com.exception.StudentException;

public interface StudentDao {

	public String regesterStudent2(Student student);
	 
	public Student getStudentByRoll(int Roll) throws StudentException;

	public Student loginStudent(String username,String password) throws StudentException;
	
	public List<Student> getAllDetails() throws StudentException;
}
