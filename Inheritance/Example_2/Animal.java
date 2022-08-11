package sp_3_day_2_q2;

public class Animal {

	public void makeNoise() {
		System.out.println("Animal making Noise");
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void walk() {
		System.out.println("Animal is walking");
	}
	
}


class Dog extends Animal{
	
   @Override
   public void makeNoise() {
	   System.out.println("Barking....");
   }
   
}


class Cat extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Meaw...");
	}
	
}


class Tiger extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Roaring...");
	}
	
}