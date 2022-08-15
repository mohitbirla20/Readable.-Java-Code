package sp3d5.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for find Prime number :");
		int num = sc.nextInt();
		
		Test t = new Test();
		int[] arr = t.display(num);
		//System.out.println(arr[4]);
	}

}
