package serielization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Main2 {
 
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("file.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	
		Object obj=ois.readObject();
		A a1=(A)obj;
		a1.funA();
	}
	
}
