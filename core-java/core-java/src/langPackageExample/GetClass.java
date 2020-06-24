package langPackageExample;

public class GetClass {

	public static void main(String[] args) {

		Object object = new String("hello");
		Class classObj = object.getClass();
		System.out.println("Class from" + classObj.getName());

	}// we can not override getclass method .it is final.

}
