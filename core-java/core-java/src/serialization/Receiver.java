package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Receiver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fi=new FileInputStream("src/serialization/UID.txt");
		
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		MyDetails a2=(MyDetails)oi.readObject();
		System.out.println(a2.i +""+a2.s+""+a2.j);
		
		fi.close();
		oi.close();
	}

}
class MyDetails implements Serializable{
	
	private static final long serialVersionUID = 7473262807974452163L;
	int i=10;
	String s="hello";
	int j=30;
	
	

}
