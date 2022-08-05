package sprint_2_day_1;

public class EvenOdd {

	void checkNumber(int a){
	     if(a<0) {
	    	 System.out.println("Error");
	    	 return;
	     }
	     
	     else if(a%2!=0) {
	    	 System.out.println(a);
	     }
	     
	     else {
	    	 
	    	while(a%10 != 0) {
	    		a++;
	    	}
	    	System.out.println(a);
	    	
	     }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOdd obj = new EvenOdd();
		obj.checkNumber(-2);
		obj.checkNumber(45);
		obj.checkNumber(44);
		
	}

}
