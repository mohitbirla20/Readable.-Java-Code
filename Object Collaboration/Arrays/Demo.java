package during_class;


import java.util.Scanner;

public class Demo {
	
	
	void fun1(Student[] students) {
	
		if(students != null) {
		
		System.out.println("inside fun1() of Demo");
		
			for(Student student:students) {
				
				System.out.println("Roll is :"+student.getRoll());
				System.out.println("Name is :"+student.getName());
				System.out.println("Marks is :"+student.getMarks());
				
				System.out.println("================================");
			}
			
			
		}else
			System.out.println("null not allowed...");
		
	}
	

	public static void main(String[] args) {
	
		Demo d1= new Demo();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many Student ?");
		int num= sc.nextInt();
		
		Student[] students = new Student[num];//3
		
		
		for(int i=0;i<students.length;i++) {
			
			System.out.println("Enter Details of Student "+(i+1));
			
			System.out.println("Enter roll:");
			int roll= sc.nextInt();
			
			System.out.println("Enter Name");
			String name= sc.next();
			
			System.out.println("Enter Marks");
			int marks= sc.nextInt();
			
		 students[i]=new Student(roll, name, marks);
	//students[i] = new Student();
	//students[i].setRoll(roll);
	//students[i].setName(name);
	//students[i].setMarks(marks);
			
		}		
	
		d1.fun1(students);
		
		
	}

}