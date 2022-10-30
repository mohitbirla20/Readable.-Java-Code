package com.masai.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String location;
	
	@OneToMany
	private List<Student> students;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Collage [cid=" + cid + ", name=" + name + ", location=" + location + "]";
	}
	
	
	public Collage(int cid, String name, String location, List<Student> students) {
		super();
		this.cid = cid;
		this.name = name;
		this.location = location;
		this.students = students;
	}
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
