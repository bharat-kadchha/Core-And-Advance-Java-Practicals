package reflectionAPI;

class Sample1 {

}

public class Test1 {
	public static void main(String[] args) {

		try {
			Class<?> myClass = Class.forName("Sample");
			System.out.println(myClass.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.err.println("Error");

	}

}
