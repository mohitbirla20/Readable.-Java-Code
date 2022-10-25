package com.masai;

public class Traval {

	private Vehical v;

	private int numberOfPerson;
	
//	public Traval(Vehical v) {
//		super();
//		this.v = v;
//	}


	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}

	public void setV(Vehical v) {
		this.v = v;
	}
	
	public void journey() {
       v.go();
       System.out.println("jurny started");
       System.out.println("Number of person"+numberOfPerson);
	}
	
	
}
