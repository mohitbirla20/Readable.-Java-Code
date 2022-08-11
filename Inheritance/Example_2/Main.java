package sp_3_day_2_q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//create an array of Animal class with size 3
         Animal[] array = new Animal[3];
         
		//initialise all 3 elements of this Animal class with
		//Dog, Cat and Tiger class object.
        array[0]=new Dog();
        array[1]=new Cat();
        array[2]=new Tiger();
        
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
        array[0].eat();
        array[0].walk();
        array[0].makeNoise();
        
        array[1].eat();
        array[1].walk();
        array[1].makeNoise();
        
        array[2].eat();
        array[2].walk();
        array[2].makeNoise();
        
   
	}

}
