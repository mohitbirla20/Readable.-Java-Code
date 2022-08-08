package evalutaionn;

import java.util.Scanner;

public class Practise {

	void checkCred(String username,String password) {
		
		if(username  == "mohit" && password == "123") {
			System.out.println("mohit is great main");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           A obj = new A();
           Practise d1 = new Practise();
           System.out.println("Write number here");

           Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();
           
           System.out.println(num);
           
           d1.checkCred("mohit", "123");
           obj.showNumber("admin" , "123");
           
	}

}
