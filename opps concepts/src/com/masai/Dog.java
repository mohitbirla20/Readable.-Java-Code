package com.masai;

public class Dog extends Animal{

	private String breed;
	
	public Dog() {
		super();
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}
	
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	

	@Override
	void makeNoise() {
		System.out.println("dog is barking");
	}

	@Override
	void eat() {
		System.out.println("dog is eating");
	}

	public void play() {
		System.out.println("dog is playing");
	}
	
	
	
}
