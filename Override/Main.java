package unit_4.sp3d3;

import java.time.Instant;

public class Main {

	public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			return new Student();
		}else {
			return new Instructor();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person student = generatePerson(new Student());
       
      Person teacher = generatePerson(new Instructor());
       
       System.out.println(student);
       System.out.println(teacher);
	}

}
