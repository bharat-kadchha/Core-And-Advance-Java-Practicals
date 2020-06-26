package enumdemo;

//We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.

enum Employee {
	NAME, CITY;

	Employee() // executed separately for each enum constant //so its call 2 times for this
				// code.
	{
		System.out.println("enum constructor");

	}

	public void info() /// concrete methods and abstract methods
	{
		System.out.println(NAME + "---" + CITY);
	}

}

public class EnumDemo3 {
	public static void main(String[] args) {

		Employee employee = Employee.NAME;
		System.out.println(employee);
		employee.info();

	}
}
