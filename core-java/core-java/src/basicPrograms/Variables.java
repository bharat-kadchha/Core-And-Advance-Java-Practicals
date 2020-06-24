package basicPrograms;

public class Variables {

	int c; // instance variable
	static String name = "bharat"; // static variable

	public void add() {
	
		int a = 10, b = 20; // local variable
		c = a + b;

		System.out.println("addition=" + c);
	}

	public static void main(String[] args) {

		int a = 10; // local variable
		
		System.out.println(a);
		System.out.println(name);
		
		Variables v1 = new Variables(); // object reference
		v1.add();

	}

}
