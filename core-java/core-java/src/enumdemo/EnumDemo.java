package enumdemo;

//Enum declaration can be done outside a Class or inside a Class but not inside a Method
enum Bike {
	HONDA, SUZUKI; // out side of class
}

public class EnumDemo {

	enum Car // inside of class
	{
		HONDA, MAHINDRA;
	}

	public static void main(String[] args) {

		System.out.println(Bike.HONDA);
		System.out.println(EnumDemo.Car.MAHINDRA);
	}

}
