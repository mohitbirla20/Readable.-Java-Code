package sprint_2_day_1;

/*      
     Static Variables:-
                        When a variable is declared as static,
     then a single copy of the variable is created and shared
     among all objects at a class level. Static variables are, 
     essentially, global variables.All instances of the class 
     share the same static variable.
     
     
     Non static variables can be accessed using instance of a class
     Non static variables do not reduce the amount of memory used by
      a program
 */

public class First {

	  // static variable
    static int a = m1();
  
    // static block
    static
    {
        System.out.println("Inside static block");
    }
  
    // static method
    static int m1()
    {
        System.out.println("from m1");
        return 20;
    }
  
    // static method(main !!)
    public static void main(String[] args)
    {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }
    
    // non-static variable
    int rk = 10;

}
