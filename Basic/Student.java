package sprint_2_day_1;

public class Student {
     
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int roll,String name,int marks) {
		
		System.out.println("Roll No. is :- "+roll);
		System.out.println("Name is :- "+name);
		System.out.println("Marks is :- "+marks);	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Student obj = new Student();
		Student S1 = new Student();
	     S1.roll = 487;
		S1.name = "Mohit Birla";
		S1.marks = 98;
		
	obj.displayStudentDetails(S1.roll, S1.name, S1.marks);
	
	}

}
