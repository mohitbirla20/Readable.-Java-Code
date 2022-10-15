package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.entity.Department;
import com.masai.entity.Employee;
import com.masai.util.EMUtil;

public class Demo2 {

	public static void main(String[] args) {
		Department dept = new Department();
		dept.setName("Manager");
		dept.setLocation("Mumbai");
	
		
		Employee emp1 = new Employee();
		emp1.setName("Mohit Birla");
		emp1.setSalary(60000);
		emp1.setDept(dept);
		
		Employee emp2 = new Employee();
		emp2.setName("Vanshika Birla");
		emp2.setSalary(65000);
		emp2.setDept(dept);

		Employee emp3 = new Employee();
		emp3.setName("Rohit Brila");
		emp3.setSalary(70000);
		emp2.setDept(dept);

		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.getTransaction().commit();
		em.close();
		
		
	}

}
