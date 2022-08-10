package during_class;

public class Student {
  
  private	int roll;
  private	int marks;
  private  String name;

   public Student() {
	   
   }
   
   public Student(int roll, String name,int marks) {
	 this.roll = roll;
	 this.name = name;
	 this.marks = marks;
   }

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   
}
