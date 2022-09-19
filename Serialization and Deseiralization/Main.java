package serielization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    
	public static void main(String[] args) throws Exception {
	A a = new A();
	FileOutputStream fo = new FileOutputStream("src//file.txt");
	ObjectOutputStream foo = new ObjectOutputStream(fo);
	foo.writeObject(a);
	foo.close();
	System.out.println("done");
	}
}
