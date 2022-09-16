package synchronization;

public class Common {

	public synchronized void fun(String name) {
		System.out.println("Well-Come");
		try {
			Thread.sleep(1000);
		}catch (Exception e) {

		}
		System.out.println(name);
	}
	
}
