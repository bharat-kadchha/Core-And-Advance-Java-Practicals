package knowledge;

public class TypeCasting {

	public static void main(String[] args) {

		byte b = 10;
		System.out.println("byte value =" + b);
		int i = b;
		System.out.println("byte to int =" + i);
		short s = b;
		System.out.println("byte to short =" + s);
		int x = s;
		System.out.println("short to int =" + x);

		int a = 1234;
		System.out.println("int value =" + a);
		float f = a;
		System.out.println("int to float =" + f);

		System.out.println("int to byte " + b);
		s = (short) a;
		System.out.println("int to short " + s);

		f = 12.45f;
		System.out.println("float value " + f);
		a = (int) f;
		System.out.println("float to int " + a);
		s = (short) f;
		System.out.println("flaot to short " + s);

	}

}
