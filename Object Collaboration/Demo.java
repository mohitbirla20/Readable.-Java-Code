package evalutaionn;

public class Demo {
 
	A fun1(String username , String password) {
		
		if(username == "mohit" && password == "12345") {
			System.out.println("inside fun1 of demo");
			return new A();
		}
		 else {
		return null;
		}
	}
	
		public static void main(String[] args) {
			
			Demo d1 = new Demo();
			A obj = d1.fun1("mohit", "1245");
			if(obj != null) 
			    System.out.println("jay shree ram");
			else 
				System.out.println("invaliad credaiini");
		
		
		}	

	
}
