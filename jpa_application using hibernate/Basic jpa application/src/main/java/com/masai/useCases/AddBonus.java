package com.masai.useCases;

import java.util.Scanner;

import com.masai.EmployeeDao.EmployeeDaoImplements;

public class AddBonus {

	public static void addBonus() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
	    int empid = sc.nextInt();
	    
	    System.out.println("Enter bonus");
	    int bonus = sc.nextInt();
	    
	    EmployeeDaoImplements obj = new EmployeeDaoImplements();
	    System.out.println(obj.giveBonusToEmployee(empid, bonus));
	    
		
	}
	
}
