package reflectionAPI;

public class Test3 {

	public static void main(String[] args) {
		Class<?> c = Sample.class;

		System.out.println(c.getName());

		Class<String> c1 = String.class;
		System.out.println(c1.getName());
	}
}
