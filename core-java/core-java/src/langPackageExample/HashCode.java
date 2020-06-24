package langPackageExample;

class Hash {
	String s1 = "abcdefg";
	int r = 100;

	public int hashCode() {
		return r;
	}
}

public class HashCode {

	public static void main(String[] args) {

		Hash obj = new Hash();
		System.out.println(obj.hashCode()); // over ride method
		System.out.println(obj.toString()); // call toString and then hashcode value convert in to hax. value
	}
}
