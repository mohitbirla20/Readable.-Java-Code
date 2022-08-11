package sp_3_day_2_q4;

/*

Explain the difference between overloading and
 overriding methods with an example?

In the method overloading, methods or functions 
must have the same name and different signatures.
Method overloading is a example of compile time
polymorphism.In the method overloading, inheritance
 may or may not be required.

Whereas in the method overriding, methods or 
functions must have the same name and same 
signatures.Whereas method overriding is a 
example of run time polymorphism.Whereas in
 method overriding, inheritance always required.

*/


// method overloading
class MethodOverloadingEx {
 
    static int add(int a, int b)
    {
      return a + b;
    }
 
    static int add(int a, int b, int c)
    {
        return a + b + c;
    }
 
    public static void main(String args[])
    {
          System.out.println("add() with 2 parameters");
        System.out.println(add(4, 6));
       
          System.out.println("add() with 3 parameters");
        System.out.println(add(4, 6, 7));
    }
}



// method overrideing
class Animal {
	 
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}
 
class Dog extends Animal {
 
    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}
 
class MethodOverridingEx {
 
    public static void main(String args[])
    {
        Dog d1 = new Dog();
        Animal a1 = new Animal();
 
        d1.eat();
        a1.eat();
 
        Animal animal = new Dog();
        // eat() method of animal class is overridden by
        // base class eat()
        animal.eat();
    }
}