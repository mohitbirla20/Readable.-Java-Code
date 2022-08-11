package sp_3_day_2;

public class Bird {

	public void fly() {
		System.out.println("Bird is flying");
	}	
	
}
 class Parrot extends Bird{
	@Override
	public void fly() {
		System.out.println("I am flying");
	}
	
	public void sing() {
		System.out.println("I am singing");
	}
}