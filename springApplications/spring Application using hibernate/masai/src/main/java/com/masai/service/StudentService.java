package com.masai.service;

import com.masai.entity.Collage;
import com.masai.entity.Student;

public interface StudentService {

	public String saveStudent(Student student);
	
	public String saveCollage(Collage collage);
	
	public String assignCollage(Student student);
	
}
