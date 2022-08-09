package question_1;

import java.util.Scanner;

public class Main {

	public static String reversString(String input){
		//write the logic
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			
			reverse =reverse + input.charAt(i);
			
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.nextLine();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		
	}

}
