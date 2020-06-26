package reflection_api;

public class InbuiltClassExample {
	public static void main(String[] args) {

		Class<?> c = InbuiltClassExample.class;

		System.out.println(c.isLocalClass());

		c = SampleDemo.class;

		System.out.println(c.isInterface());

		c = Integer.class;
		System.out.println(c.isPrimitive());
	}

}
interface SampleDemo
{
	 
}
