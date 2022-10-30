package com.masai.dao;

import com.masai.entity.Collage;
import com.masai.entity.Student;

public interface StudentDao {

	public String saveStudentDetails(Student student);
	
	public String saveCollageDetails(Collage collage);
	
	public String assignCollage(Student student);
	
}
