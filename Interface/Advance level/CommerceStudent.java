package question6;

import java.util.Scanner;

public class CommerceStudent implements Student {

	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	
	public int getAccountMarks() {
		return accountMarks;
	}
	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}
	public int getEconomicsMarks() {
		return economicsMarks;
	}
	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}
	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}
	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}
	
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		double parcent = 0.0;
	
		CommerceStudent obj = new CommerceStudent();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks for accountMarks");
		int accountMarks = sc.nextInt();
		obj.setAccountMarks(accountMarks);
		
		System.out.println("Enter the Marks for economicsMarks ");
		int economicsMarks = sc.nextInt();
		obj.setEconomicsMarks(economicsMarks);
		
		System.out.println("Enter the Marks for businessStudiesMarks ");
		int businessStudiesMarks = sc.nextInt();
		obj.setBusinessStudiesMarks(businessStudiesMarks);
		
		int sum = 0;
		sum = accountMarks+economicsMarks+businessStudiesMarks;
		parcent = sum/3;
		
		
		System.out.println("Percentage is: "+parcent);
		return parcent;
	}
}
