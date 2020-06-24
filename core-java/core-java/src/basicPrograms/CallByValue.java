package basicPrograms;

public class CallByValue {
	int number = 30;

	public static void main(String[] args) {

		CallByValue obj = new CallByValue();
		System.out.println("before change " + obj.number);
		obj.add(obj.number);
		System.out.println("after change " + obj.number);

	}

	void add(int a) {
		number = number + 20;
	}
}
