package sp3d5.question4;

public class Test implements Intr{

	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		int[] arr = new int[p];
		
		
		for(int i=2;i<=p;i++) {
			int count = 0;
			//int num = i;
			for(int j =1;j<=i;j++) {
			
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i+" ");
			}
		}
		
		return arr;
	}
	


}
