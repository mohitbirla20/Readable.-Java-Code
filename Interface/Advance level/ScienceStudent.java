package question6;

import java.util.Scanner;

public class ScienceStudent implements Student {

	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getBiologyMarks() {
		return biologyMarks;
	}
	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}
	
	
	

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		double parcent = 0.0;
	
		ScienceStudent obj = new ScienceStudent();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks for physicsMarks");
		int physicsMarks = sc.nextInt();
		obj.setPhysicsMarks(physicsMarks);
		
		System.out.println("Enter the Marks for chemistryMarks ");
		int chemistryMarks = sc.nextInt();
		obj.setChemistryMarks(chemistryMarks);
		
		System.out.println("Enter the Marks for mathsMarks ");
		int mathsMarks = sc.nextInt();
		obj.setMathsMarks(mathsMarks);
		
		System.out.println("Enter the Marks for  biologyMarks");
		int biologyMarks = sc.nextInt();
		obj.setBiologyMarks(biologyMarks);
		
		int sum = 0;
		sum = biologyMarks+mathsMarks+chemistryMarks+physicsMarks;
		parcent = sum/4;
		
		
		System.out.println("Percentage is: "+parcent);
		return parcent;
	}

	
	
	
}
