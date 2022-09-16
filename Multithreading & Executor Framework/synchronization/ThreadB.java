package synchronization;

public class ThreadB extends Thread{

	Common c;
	String name;
	
	
	public ThreadB(Common c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.fun(name);
	}
	
}

