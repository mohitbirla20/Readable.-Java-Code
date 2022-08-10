package during_class;

import java.util.Scanner;

public class MyDemo {

	void fun2(Student[] students){
		
		if(students != null) {
			
			System.out.println("This is all the students");
			
			for(Student student : students) {
				
				System.out.println("Roll no. is: "+student.getRoll());
				System.out.println("Name is :"+student.getName());
				System.out.println("Marks is :"+student.getMarks());
				
				System.out.println("================================");
				
			}
		}else
			System.out.println("Null value is not allowed");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDemo d2 = new MyDemo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Students you want");
		int num = sc.nextInt();
		
		Student[] students = new Student[num];
		
		for(int i=0;i<num;i++) {
			
			System.out.println("Enter Details of Student "+(i+1));
			
			System.out.println("Enter roll:");
			int roll= sc.nextInt();
			
			System.out.println("Enter Name");
			String name= sc.next();
			
			System.out.println("Enter Marks");
			int marks= sc.nextInt();
			
		 students[i] = new Student(roll,name,marks);
		}
		
		d2.fun2(students);
		
	}

}
