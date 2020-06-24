package constructor;

public class Wrapper {

	public static void main(String[] args) {

		int a = 200;
		Integer i1 = Integer.valueOf(a);// autoboxing
		System.out.println(i1);

		Integer i2 = new Integer(300);
		int p = i2.intValue(); // unboxing
		System.out.println(p);

	}

}
