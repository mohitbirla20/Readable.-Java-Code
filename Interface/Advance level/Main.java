package question6;

import java.util.Scanner;

public class Main {

	public static double getStudent(int i) {
		double parcentage = 0.0;
		
		if(i == 1) {
			ArtStudent obj = new ArtStudent();
			parcentage=	obj.findPercentage();
		}
		else if(i == 2) {
			ScienceStudent obj = new ScienceStudent();
			parcentage=obj.findPercentage();
		}
		else if(i == 3) {
			CommerceStudent obj = new CommerceStudent();
			parcentage	=obj.findPercentage();
		}else {
			System.out.println("Choose any no. between 1 to 3 for this students");
		}
		
		
		return parcentage ;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Which Student percentage do you want to find:");
		System.out.println("1. ArtStudent");
		System.out.println("2. ScienceStudent");
		System.out.println("3. CommerceStudent");
		
		Scanner sh = new Scanner(System.in);
		int num = sh.nextInt();
		
         getStudent(num);
	}

}