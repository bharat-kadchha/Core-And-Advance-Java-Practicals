package reflectionAPI;

public class Test4 {
	public static void main(String[] args) {

		Class<?> c = Test4.class;

		System.out.println(c.isLocalClass());

		c = SampleDemo.class;

		System.out.println(c.isInterface());

		c = Integer.class;
		System.out.println(c.isPrimitive());
	}

}
