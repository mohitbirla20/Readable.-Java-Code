package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.masai.entity.Collage;
import com.masai.entity.Student;
import com.masai.utility.DBUtil;
import com.masai.utility.EMUtil;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Override
	public String saveStudentDetails(Student student) {
		
		String massage = "Student detail added succes...!";
		
//		try(Connection conn = DBUtil.provideConnection()){
//			
//			PreparedStatement ps = conn.prepareStatement("insert into student(name,marks) values(?,?)");
//			//ps.setInt(1, student.getRoll());
//		    ps.setString(1, student.getName());
//		    ps.setInt(2, student.getMakrs());
//			
//		    int x = ps.executeUpdate();
//		    
//		}catch(SQLException e) {
//			massage = e.getMessage();
//		}
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		
		return massage;
	}

	@Override
	public String saveCollageDetails(Collage collage) {
		
		String massage = "Collage Details Added succes";
        EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(collage);
		em.getTransaction().commit();
		em.close();
		
		return massage;
		
	}

	@Override
	public String assignCollage(Student student) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Collage collage = em.find(Collage.class, 1);
		
	     em.getTransaction().begin();
		collage.getStudents().add(student);
		em.persist(collage);
		em.getTransaction().commit();
		em.close();
		return "Collage Assigned";
		
	}

	
	
}
