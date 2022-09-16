package multitreading;

public class ThreadB implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10;i<20;i++) {
			System.out.println(i +" "+Thread.currentThread().getName());
		}
	}

}
