package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.StudentDao;
import com.masai.entity.Collage;
import com.masai.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao sdao;
	
	@Override
	public String saveStudent(Student student) {
		return sdao.saveStudentDetails(student);
	}

	@Override
	public String saveCollage(Collage collage) {
	  return sdao.saveCollageDetails(collage);
	}

	@Override
	public String assignCollage(Student student) {
	   return sdao.assignCollage(student);
	}

}
