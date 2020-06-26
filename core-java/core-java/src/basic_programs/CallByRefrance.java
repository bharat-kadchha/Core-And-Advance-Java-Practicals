package basic_programs;

public class CallByRefrance {

	int number = 20;

	public static void main(String[] args) {

		CallByRefrance obj = new CallByRefrance();
		System.out.println("before change " + obj.number);

		obj.add(obj);
		System.out.println("after change " + obj.number);

	}

	void add(CallByRefrance c1) {

		c1.number = c1.number + 20;
	}
}
