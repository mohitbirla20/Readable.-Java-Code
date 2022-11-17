package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Student;
import com.masai.utility.DBUtil;
import com.mysql.cj.protocol.Resultset;

import masai.com.exception.StudentException;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String regesterStudent2(Student student) {
        String massage = "Not Inserted..";
        
		try(Connection conn = DBUtil.provideConnection();){
			
		PreparedStatement ps=conn.prepareStatement("insert into student(name,marks,email,password) values(?,?,?,?)");
		ps.setString(1, student.getName());	
	    ps.setInt(2,student.getMarks());	
	    ps.setString(3 , student.getEmail());
	    ps.setString(4, student.getPassword());
	    
	    int x = ps.executeUpdate();
	    if(x>0) {
	    	massage = "Value inserted...";
	    }
	    
		}catch (SQLException e) {
            massage = e.getMessage();
		}
        
        
		return massage;
	}

	
	
	
	@Override
	public Student getStudentByRoll(int Roll) throws StudentException {
	   
		Student student = null;
		
		try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("select * from student where roll=?");
		ps.setInt(1, Roll);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			int r = rs.getInt("roll");
			String name = rs.getString("name");
			int marks = rs.getInt("marks");
			String e = rs.getString("email");
			String p = rs.getString("password");
			
			student = new Student(r,marks,name,e,p);
		}else 
			throw new StudentException("Student does not exist..");
		
			
		}catch (SQLException e) {
			e.printStackTrace();
			
			throw new StudentException(e.getMessage());
		}
		
		return student;
		
	}




	@Override
	public Student loginStudent(String username, String password) throws StudentException {
      
		Student student = null;
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from student where email=? and password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int r = rs.getInt("roll");
				String name = rs.getString("name");
				int marks = rs.getInt("marks");
				String e = rs.getString("email");
				String p = rs.getString("password");
				
				student = new Student(r,marks,name,e,p);
			}else 
				throw new StudentException("Wrong username or password");
			
		}catch (SQLException e) {
           throw new StudentException(e.getMessage());
		}
		
		return student;
	}




	@Override
	public List<Student> getAllDetails() throws StudentException {

		List<Student> students = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from student");
			
			ResultSet rs=ps.getResultSet();
			while(rs.next()) {
				int r = rs.getInt("roll");
				String name = rs.getString("name");
				int marks = rs.getInt("marks");
				String e = rs.getString("email");
				String p = rs.getString("password");
				
				Student student = new Student(r,marks,name,e,p);
				students.add(student);
			}
			
		}catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		if(students.size()==0)
			throw new StudentException("No Student here..");
		else
		    return students;
	}

	