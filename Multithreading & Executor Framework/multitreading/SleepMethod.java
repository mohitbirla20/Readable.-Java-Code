package multitreading;

public class SleepMethod implements Runnable{

	@Override
	public void run() {
       for(int i=0;i<10;i++) {
    	   System.out.println("inside run "+i);
    	   try {
    	   Thread.sleep(1000); //sleep for one second in this one second
    	                       //inside this thread jo bhi he unpe kam start ho jayega;
    	   }catch (Exception e) {
		      }
    	   for(int j=0;j<5;j++) {
    		   System.out.println("simple method "+j);//jab tak one second ke liyo pouse hoga tab tak
    	   //we can also aply the same sleep method for 
    	  //this loop also.
    	   }
       }
	}
	
	
	public static void main(String[] args) {
		SleepMethod job = new SleepMethod();
		Thread t1 = new Thread(job);
		t1.start();
	}
   
}
