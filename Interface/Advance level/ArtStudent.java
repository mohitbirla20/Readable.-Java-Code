package question6;

import java.util.Scanner;

public class ArtStudent implements Student {

	private	int hindiMarks;
	private	int englishMarks;
	private	int historyMarks;
	
	
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	
	
	
	
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		double parcent = 0.0;
	
		ArtStudent obj = new ArtStudent();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks for hindiMarks");
		int hindiMarks = sc.nextInt();
		obj.setHindiMarks(hindiMarks);
		
		System.out.println("Enter the Marks for englishMarks ");
		int englishMarks = sc.nextInt();
		obj.setEnglishMarks(englishMarks);
		
		System.out.println("Enter the Marks for historyMarks ");
		int historyMarks = sc.nextInt();
		obj.setHistoryMarks(historyMarks);
		
		int sum = 0;
		sum = englishMarks+historyMarks+hindiMarks;
		parcent = sum/3;
		
		
		System.out.println("Percentage is: "+parcent);
		return parcent;
	}
	
}
