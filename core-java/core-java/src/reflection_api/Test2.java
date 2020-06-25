package reflectionAPI;

class Demo {
	void create(Object obj) {
		Class<? extends Object> c = obj.getClass();
		System.out.println(c.getName());
	}
}

public class Test2 {

	public static void main(String[] args) {

		Demo demo = new Demo();
		Sample sample = new Sample();

		demo.create(sample);
	}
}
