package langPackageExample;

public class CloneableObject implements Cloneable { // java.lang.cloneable interface

	int en;
	String s;

	CloneableObject(int en, String s) {
		this.en = en;
		this.s = s;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		CloneableObject c1 = new CloneableObject(10, "rahul");

		System.out.println(c1.en + " " + c1.s);

		CloneableObject c2 = (CloneableObject) c1.clone();

		System.out.println(c2.en + " " + c2.s);
	}

}
/*
 * advantage==1=no need to write lengthy code 2=Easily copy object to another
 * 3=fast clone()
 * 
 * disadvantage=1 == use clone() then write different line of code 2== handle
 * exception 3==clone() dosen't invoke constructor 4==clone() method inherits
 * from another super class.
 */
