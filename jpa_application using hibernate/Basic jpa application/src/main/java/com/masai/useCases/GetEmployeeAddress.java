package com.masai.useCases;

import java.util.Scanner;

import com.masai.EmployeeDao.EmployeeDaoImplements;

public class GetEmployeeAddress {

	public static String getEmployeeAddress() {
		
		EmployeeDaoImplements obj = new EmployeeDaoImplements();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int empid = sc.nextInt();
		
		return obj.getAddressOfEmployee(empid);
		
	}
	
}
