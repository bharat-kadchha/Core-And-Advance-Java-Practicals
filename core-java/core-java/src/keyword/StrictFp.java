package keyword;

class ClassExample {
	// strictfp is keyword to calculate floating point on any platform of any OS
	// with same return values.
	strictfp double method2(double a, double b) // method
	{
		return (a + b);
	}
}

public class StrictFp {
	public static void main(String[] args) {

		ClassExample classExample = new ClassExample();
		double b1 = classExample.method2(12.1233, 67.442);
		System.out.println(b1);

	}

}
