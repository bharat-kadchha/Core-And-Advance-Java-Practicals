package knowledge;

public class MethodDeclaration {

	public static void points() // void function(method)
	{
		double p = 67.5;
		if (p >= 60)
			System.out.println("frist class");
		else
			System.out.println("second class");
	}

	public static int value() // return type function(method)
	{
		int id = 10;
		return id;
	}

	public static void swep(int a, int b) // Parameterized method
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("after sweping a=" + a + "b=" + b);

	}

	public static void main(String[] args) {

		System.out.println("void method");
		points(); // directly call

		int id = value(); // return call method

		System.out.println("retun method\n" + id);

		swep(10, 20);
	}

}
