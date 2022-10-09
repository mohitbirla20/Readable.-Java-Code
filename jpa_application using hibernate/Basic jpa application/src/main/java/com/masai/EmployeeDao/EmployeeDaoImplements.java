package com.masai.EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeDaoImplements implements EmployeeDao{

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
	
	
	@Override
	public void save(Employee employee) {
        
		EntityManager em = emf.createEntityManager();
		
	    em.getTransaction().begin();
	    em.persist(employee);
	    em.getTransaction().commit();
	    em.close();
	    
	    System.out.println("Employee saved");
		
	}


	@Override
	public String getAddressOfEmployee(int empId) {
		
		String address = "Employee not found";
		
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null)
			address = emp.getAddress();
		
		return address;
	}


	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		
		String massage = "Employee Not Found";
		
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		 
		if(emp != null) {
			em.getTransaction().begin();
			emp.setSalary(emp.getSalary()+bonus);
			em.getTransaction().commit();
		    massage = "Bonuse added in salary for this employee";
		}
					
		return massage;
	}


	@Override
	public boolean deleteEmployee(int empId) {

		boolean flag = false;
		
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null) {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			flag = true;
		}
			
		
		return flag;
	}
   
}
