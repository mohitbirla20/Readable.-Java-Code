package question_2;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of rows : ");
		int row = sc.nextInt();
		
		System.out.print("Enter no of col : ");
		int col = sc.nextInt();

		int [][] arr = new int[row][col];
		int count  = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j] = count;
				count++;
			}
		}
		
		for(int[] ar : arr) {
			for(int i:ar) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("=====================");
		System.out.println("Sum of all columns :-");
		
		for(int i=0;i<col;i++) {
			int sum = 0;
	       for(int j=0;j<row;j++) {
	    	   if(arr[j][i]%2 == 0) {
	    		   sum += arr[j][i];
	    	   }
	       }
	       System.out.println(sum);
		}
		
	}

}
