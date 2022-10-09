package com.masai.useCases;

import java.util.Scanner;

import com.masai.EmployeeDao.EmployeeDaoImplements;
import com.masai.entities.Employee;

public class SaveEmployeeDetails {

	public static void saveEmployeeDetials() {
 
		EmployeeDaoImplements obj = new EmployeeDaoImplements();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter empId.");
        int empid = sc.nextInt();
        
        System.out.println("Enter Employee name");
        String name = sc.next();
        
        System.out.println("Enter Employee address");
        String address = sc.next();
        
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        
        Employee emp = new Employee(empid,name,address,salary);
        obj.save(emp);
        
	}
	
}
