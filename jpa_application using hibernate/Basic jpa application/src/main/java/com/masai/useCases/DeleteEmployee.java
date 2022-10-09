package com.masai.useCases;

import java.util.Scanner;

import com.masai.EmployeeDao.EmployeeDaoImplements;

public class DeleteEmployee {

	public static void deleteEmployee() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id.");
		int empid = sc.nextInt();
		
		EmployeeDaoImplements obj = new EmployeeDaoImplements();
	
		if(obj.deleteEmployee(empid))
			System.out.println("Employee Details Deleted");
		else
			System.out.println("Employee not found");
		
	}
	
}
