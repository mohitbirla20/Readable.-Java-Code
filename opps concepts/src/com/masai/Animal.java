package com.masai;

abstract class Animal {

	private String name;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void makeNoise();
	
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	
	abstract void eat();
	
}
