package keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	transient String password; // transient variable not serialize over the network of files. jvm ignore that variable.

	transient static String city; // transient + static are serialize

	transient final int pincode; // final value not affected

	Student(int a, String n, String p, String c, int pin) {
		this.id = a;
		this.name = n;
		this.password = p;
		this.city = c;
		this.pincode = pin;
	}
}

public class TransientKeyword {
	public static void main(String[] args) throws Exception {

		Student student1 = new Student(111, "abcd", "ABC@123", "london", 234567);
		System.out.println(student1.id + "--" + student1.name + "--" + student1.password + "--" + student1.city + "--" + student1.pincode);
		
		// serialization
		FileOutputStream fos = new FileOutputStream("src/serialization/sys.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student1);
		oos.close();
		
		// deserialization
		FileInputStream fis = new FileInputStream("src/serialization/sys.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		
		Student student2 = (Student) ois.readObject();
		System.out.println(student2.id + "--" + student2.name + "--" + student2.password + "--" + student2.city + "--" + student2.pincode);
		ois.close();
		
	}

}
