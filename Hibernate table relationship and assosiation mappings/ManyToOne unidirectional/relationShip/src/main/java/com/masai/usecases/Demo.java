package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entity.Department;
import com.masai.entity.Employee;
import com.masai.util.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();
		
		/*
		Employee emp1 = new Employee();
		emp1.setName("Mohit Birla");
		emp1.setSalary(60000);
		
		Employee emp2 = new Employee();
		emp2.setName("Vanshika Birla");
		emp2.setSalary(65000);
		
		Employee emp3 = new Employee();
		emp3.setName("Rohit Brila");
		emp3.setSalary(70000);
		
		Department dept = new Department();
		dept.setName("Manager");
		dept.setLocation("Mumbai");
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		dept.getEmps().add(emp3);
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		em.close();
		*/
		
		
		//add employee in particular department.
		/*
		Department dept = em.find(Department.class, 1);
		
		Employee emp = new Employee();
		emp.setName("Jayesh choudhry");
		emp.setSalary(9000);
		
		em.getTransaction().begin();
		dept.getEmps().add(emp);
		em.getTransaction().commit();
		*/
		
		
		
		//getting all the department who is working in the department manager.
		/*
		String jpql = "select emps from Department where location=:dn";
		Query q = em.createQuery(jpql);
	   q.setParameter("dn", "Mumbai");
	   List<Employee> list = q.getResultList();
      
	list.forEach(s->System.out.println((Employee)s));
	*/
		
		
		
		
	}

}
