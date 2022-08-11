package sp_3_day_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bird b1 = new Parrot();
         
       //with this b1 reference call the fly method of  Parrot
        b1.fly();
        
        ////and after downcasting this b1 reference to the
      //  Parrot class object, call the sing method also
       ((Parrot) b1).sing();
	}

}
