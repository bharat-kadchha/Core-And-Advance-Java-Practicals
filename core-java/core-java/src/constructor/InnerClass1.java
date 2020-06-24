package constructor;

class Frist {
	private int total = 200;

	class Second // class as private is possible
	{
		void get() {
			System.out.println("inner class total = " + total);
		}
	}
}

public class InnerClass1 {
	public static void main(String[] args) {

		Frist frist = new Frist();

		// object create for inner class like that.
		Frist.Second second = frist.new Second(); // for private member access
		second.get();

	}

}
