package utilPackageExample;

public class StringBufferClass {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("abcde");
		StringBuffer sb2 = new StringBuffer(40);

		System.out.println("length =" + sb1.length());

		System.out.println("capacity =" + sb2.capacity());

		System.out.println("append =" + sb1.append("fghi"));

		System.out.println("append =" + sb1.append(12));

		System.out.println("insert =" + sb1.insert(4, 'x'));

		System.out.println("reverse =" + sb1.reverse());

		System.out.println("delete charcter =" + sb1.deleteCharAt(5));
		System.out.println("sub string =" + sb1.substring(2, 5));
		System.out.println("delete =" + sb1.delete(2, 10));

	}
}
