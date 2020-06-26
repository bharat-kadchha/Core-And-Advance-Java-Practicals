package lang_package;

class Myclass {
	String s1 = "abcdefg";
	int r = 12;

	public String toString() {
		return s1 + r;
	}

	public int hashCode() {
		return r;
	}
}

public class ToString {

	public static void main(String[] args) {

		Myclass myclass = new Myclass();
		System.out.println(myclass.hashCode());
		System.out.println(myclass.hashCode());
		System.out.println(myclass.toString());

	}

}
