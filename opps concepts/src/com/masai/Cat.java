package com.masai;

public class Cat extends Animal{

	private String nickName;
		
	public Cat() {
		super();
	}

	public Cat(String name) {
		super(name);
	}
	
	

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	void makeNoise() {
        System.out.println("mau mau");		
	}

	@Override
	void eat() {
		System.out.println("cat is eating");
	}

	
	public void jump() {
		System.out.println("cat is jumping");
	}
	
	
}
