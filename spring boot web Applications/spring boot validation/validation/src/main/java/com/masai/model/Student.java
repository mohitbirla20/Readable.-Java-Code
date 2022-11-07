package com.masai.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@Min(1)
	@Max(value = 40, message = "roll should not greater then 40")
	@NotNull(message = "roll should not be null")
	private Integer roll;
	
	@NotNull(message = "name should not null")
	@Size(min = 3,max = 25,message = "name is not in the range of 3 to 25")
	private String name;
	
	private Integer marks;

	
	
	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	
	
	public Student(@Min(18) @Max(value = 12, message = "roll should not greater then 40") Integer roll,
			@NotNull(message = "name should not null") String name,
			@Size(min = 1, max = 500, message = "marks is not in the range of 1 to 500") Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
	
}
