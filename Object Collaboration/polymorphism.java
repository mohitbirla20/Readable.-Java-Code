package findArea;

public class polymorphism {

	/*    
	 
	 In Java polymorphism is mainly divided into two types: 

   1.   Compile-time Polymorphism :- It is also known as static 
                                     polymorphism. This type of 
        polymorphism is achieved by function overloading or operator
        overloading. 
        
         Java program for Method Overloading
         by Using Different Numbers of Arguments
*/  
	
	
// Class 1
// Helper class

	// Method 1
	// Multiplication of 2 numbers
	static int Multiply(int a, int b)
	{

		// Return product
		return a * b;
	}

	// Method 2
    // Multiplication of 3 numbers
	static int Multiply(int a, int b, int c)
	{

		// Return product
		return a * b * c;
	}
	
	// Main driver method
		public static void main(String[] args)
		{

			// Calling method by passing
			// input as in arguments
			System.out.println(polymorphism.Multiply(2, 4));
			System.out.println(polymorphism.Multiply(2, 7, 3));
		}
}



/*
 
   2.   Runtime Polymorphism  :-  It is also known as Dynamic Method
                                 Dispatch. It is a process in which a
        function call to the overridden method is resolved at Runtime. 
	 

   
	 
	 */
	

