package utilPackageExample;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String s = "hello world";
		StringTokenizer st1 = new StringTokenizer(s);
		StringTokenizer st2 = new StringTokenizer("hello,hi,good,morning", ",");
		StringTokenizer st3 = new StringTokenizer("name@is@this", "@", true);

		System.out.println(st3.countTokens());
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextToken());

		}
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken("@"));
		}

		String[] a = s.split(" ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}

//StringTokenizer								split()
//	it is return one token 						return array
//	it is discards empty string
///dosnt support reguler expression					support
///
//
//
//
//
//
//
//
