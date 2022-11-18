package com.masai;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Dog();
		Animal animal2 = new Cat();
		
		animal.eat();
		animal.makeNoise();
		animal.sleep();
		
		System.out.println();
		System.out.println("====================");
		System.out.println();
		
		animal2.eat();
		animal2.makeNoise();
		animal2.sleep();
	
	}

}
