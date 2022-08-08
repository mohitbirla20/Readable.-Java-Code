package evalutaionn;

public class A {

      int x = 10;
      
      void showNumber(String username,String Password) {
    	  if(username == "admin" && Password == "123") {
    		  System.out.println("Login Succes");
    	  }else {
    		  System.out.println("Wrong credatial");
    	  }
      }

}
