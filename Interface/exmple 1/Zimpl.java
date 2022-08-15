package sp3d5.assginments;

public class Zimpl implements Z{

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("inside sum of x interface");
	}

	@Override
	public void sum2() {
		// TODO Auto-generated method stub
		System.out.println("inside sum2 of x interface");
	}

	@Override
	public void ysum() {
		// TODO Auto-generated method stub
		System.out.println("inside ysum of y interface");

	}

	@Override
	public void ysum2() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void zMethod() {
		// TODO Auto-generated method stub
		System.out.println("inside zMethod of z interface");

	}

	public static void main(String[] args) {
		Zimpl obj = new Zimpl();
		
		obj.sum();
		obj.sum2();
		obj.ysum();
		obj.zMethod();
	}
	
}
