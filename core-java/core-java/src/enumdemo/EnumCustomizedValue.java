package enumdemo;

enum Person {

	NAME("john"), CITY("london");

	private String action;

	private Person(String s) {

		this.action = s;

	}

	// getter method
	public String getAction() {
		return this.action;
	}

}

public class EnumCustomizedValue {

	public static void main(String[] args) {

		Person[] persons = Person.values();

		for (Person person : persons) {
			System.out.println(person.name() + "--" + person.getAction());
		}
	}

}
