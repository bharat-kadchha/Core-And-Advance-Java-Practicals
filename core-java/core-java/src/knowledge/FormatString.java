package inputoutput;

import java.text.DecimalFormat;
import java.util.stream.IntStream;
import java.util.stream.Stream.Builder;

public class FormatString {

	public static void main(String[] args) {
		int x = 200;
		System.out.printf("x = %d", x);
		System.out.println();
		System.out.printf("x = %f", Math.PI);
		System.out.println();
		System.out.printf("x = %.4f", Math.PI);
		System.out.println();
		System.out.printf("x = %10.4f", Math.PI);
		System.out.println();
		System.out.printf("x = %d", x);
		System.out.println();

		double num = 123.4567;

		DecimalFormat df = new DecimalFormat("####");
		System.out.println(df.format(num));
		df = new DecimalFormat("#.####");
		System.out.println(df.format(num));
		df = new DecimalFormat("#.000");
		System.out.println(df.format(num));

		double income = 23456.789;
		df = new DecimalFormat("$###,###.##");
		System.out.println(df.format(income));


	}
}
