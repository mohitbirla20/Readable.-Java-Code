package synchronization;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Common c = new Common();
        
        ThreadA a = new ThreadA(c,"Mohit");
        ThreadB b = new ThreadB(c,"Rohit");
        
        //a.start();
        //b.start();  //we can not guess the output if our fun method
                      // of common class is not synchronized because 
                     // multipal thread can enter that method so we can
                     // not get the proper output.
        
        a.start();
        b.start();  //here i our fun method is synchronized at a time one thread
                   // can inter this method so we get our output
                   //print welcome and after 1 second print the name whatever user put.
           
        
	}

}
