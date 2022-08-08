package evalutaionn;

public class B {
    
	private int acc;
	private  double balance = 4567.21;
	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc1,String username) {
		if(username == "mohit birla") {
		acc = acc1;
		}else {
			System.out.println("get lost of account");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	
	
	
}
