//package multitreading;
//
//public class JoinMethod implements Runnable{
//    
//	int sum = 0;
//	
//	@Override
//	public void run() {
//       for(int i=1;i<=10;i++) {
//    	   sum += i;
//       }
//	}
//
//}
//
//class Main{
//	
//	public static void main(String[] args) {
//		JoinMethod t = new JoinMethod();
//		Thread th = new Thread(t);
//		
//		th.start();
//		System.out.println(t.sum);//in this setuation output will
//		                          //not same that we want 
//		
//	th.start();
//		try {
//			th.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  //here main thread wiill wailt until sumis not complete
//		
//	}
//	
//}