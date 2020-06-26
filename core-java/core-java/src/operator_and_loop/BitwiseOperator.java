package operator_and_loop;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 6; // 0110
		int b = 2; // 0010
		int c = 0; // 0000

		c = a & b; // 0010
		System.out.println(" a& b =" + c);

		c = a | b; // 0110
		System.out.println(" a|b=" + c);

		c = a ^ b; // 0100
		System.out.println(" a^b=" + c);

		c = ~a; // 0111
		System.out.println(" ~a=" + c);
		c = a << 2; // 00011000
		System.out.println(" a<<2=" + c);

		c = a >> 2; // 00000001
		System.out.println(" a>>2=" + c);

		c = a >>> 2; // 0000 0001 add 2 zero at frist
		System.out.println(" a>>>2=" + c);

		System.out.println("~a=" + (~a));

		System.out.println("!a=" + !true);

	}

}
