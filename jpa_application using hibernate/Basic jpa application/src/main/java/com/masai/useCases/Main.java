package com.masai.useCases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
		System.out.println("Enter Your Choice");
		System.out.println("1. add new employee");
		System.out.println("2. get employee address");
		System.out.println("3. add bonus");
		System.out.println("4. Delete employee details");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1)
		    SaveEmployeeDetails.saveEmployeeDetials();
		if(num==2)
		    System.out.println(GetEmployeeAddress.getEmployeeAddress());
	    if(num==3)
		    AddBonus.addBonus();
		if(num==4)
		    DeleteEmployee.deleteEmployee();
	
	}

}
