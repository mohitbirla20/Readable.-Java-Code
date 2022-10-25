package com.masai;

public class Car implements Vehical{

	public static void start() {
		System.out.println("car start");
	}
	
	@Override
	public void go() {
        	start();	
	}

	
	
}