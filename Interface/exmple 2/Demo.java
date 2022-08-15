package sp3d5.question2;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		Hotel hotel = null;
		if(amount>1000) {
			hotel = new TajHotel();
		}else if(amount >200 && amount<1000) {
			hotel = new RoadSideHotel();
		}
		
		return hotel;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount you have : ");
		int amount = sc.nextInt();
		
	Hotel h =obj.provideFood(amount);
	if(h != null) {
		h.chickenBiryani();
		h.masalaDosa();
		if(h instanceof TajHotel) {
			((TajHotel) h).welcomeDrink();
		}
	}else {
		System.out.println("You have not enough amount...");
	}
	}

}
