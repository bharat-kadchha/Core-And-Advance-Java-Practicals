package object_creation;

public class NewIntanceDemo {

	String msg = "object created...";

	public static void main(String[] args) {

		try {
			Class<?> class1 = Class.forName("object.NewIntanceDemo");
			NewIntanceDemo obj = (NewIntanceDemo) class1.newInstance();
			System.out.println(obj.msg);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
