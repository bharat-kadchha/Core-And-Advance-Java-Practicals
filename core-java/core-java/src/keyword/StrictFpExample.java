package keyword;

class ClassEx {
	// strictfp is keyword to calculate floating point on any platform of any OS
	// with same return values.
	strictfp double method2(double a, double b) // method
	{
		return (a + b);
	}
}

public class StrictFpExample {
	public static void main(String[] args) {

		ClassEx classEx = new ClassEx();
		double b1 = classEx.method2(12.1233, 67.442);
		System.out.println(b1);

	}

}
