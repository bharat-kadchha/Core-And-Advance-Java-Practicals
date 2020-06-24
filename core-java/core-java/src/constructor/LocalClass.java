package constructor;

class FristClass {
	private int p = 20;

	void display() {
		class SecondClass 
		{
			void msg() {
				System.out.println("data " + p);
				}
		}
		
		SecondClass s1 = new SecondClass();
		s1.msg();
	}
}

public class LocalClass {
	public static void main(String[] args) {

		FristClass obj = new FristClass();
		obj.display();
	}

}
