package knowledge;

public class UnderscoreName {

	public static void main(String[] args) {

		int a_a = 10;
		int _ = 20; // after JDK 9 we can't user _ as variable name and get compile time error.

		System.out.println(a_a);
		System.out.println(_); // in jDK 8 JVM gives warning.

	}

}
