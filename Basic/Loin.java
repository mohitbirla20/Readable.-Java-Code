package sprint_2_day_1;


public class Loin {

	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	
	
	void thinking(boolean isHungry , String name,int age) {
		
		if(isHungry == false) {
			System.out.println(name + " is sleeping");
		}else if(isHungry == true && age>12) {
			totalDeaths += 2;
			System.out.println(name + " is eaten two animal");
		}else if(isHungry == true && age<=12 && age>=2) {
			totalDeaths += 1;
			System.out.println(name + " is eaten one animal");
		}else if(isHungry == true && age<2) {
			System.out.println(name+" is calling is mom");
		}
		
	}
	
	static void printKillings(int totalDeaths) {
		  System.out.println("Total Killings by loin in jungle "+ totalDeaths);	
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Loin loin1 = new Loin();
    Loin loin2 = new Loin();
    Loin loin3 = new Loin();
    
   loin1.name = "King";
   loin1.age = 12;
   loin1.isHungry = false;
   
   loin2.name = "Veer";
   loin2.age = 13;
   loin2.isHungry = true;
   
   loin3.name = "Baby";
   loin3.age = 1;
   loin3.isHungry = true;
   
   loin1.thinking(loin1.isHungry, loin1.name, loin1.age);
   loin1.thinking(loin2.isHungry, loin2.name, loin2.age);
   loin1.thinking(loin3.isHungry, loin3.name, loin3.age);
   printKillings(3);
   
	}

}
