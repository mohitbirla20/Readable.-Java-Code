package com.masai.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String name;
	private String location;
	
	/*
	@OneToMany
	//@OntToMany(cascade = CascadeType.REMOVE) if we delete dept so all the emp
                                             //will be deleted that are in that dept;
    //@OntToMany(cascade = CascadeType.All) if we delete dept so all the emp
	                                        // if we save dept emp also save;
                                             //will be deleted that are in that dept;
	private List<Employee> emps = new ArrayList<>();
    */
	
	
	// to change the name third table and column also.
	//@OneToMany
	//@OntToMany(cascade = CascadeType.REMOVE) if we delete dept so all the emp
     
	
	//will be deleted that are in that dept;
    /*
	@OneToMany(cascade =  CascadeType.ALL)
	@JoinTable(name = "dept_emp",joinColumns = @JoinColumn(name="did"),inverseJoinColumns = @JoinColumn(name="empid"))
    private List<Employee> emps = new ArrayList<>();
	*/
    
    
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
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
		
	
}
