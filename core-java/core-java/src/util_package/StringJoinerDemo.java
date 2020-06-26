package util_package;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		String[] names = { "kailash", "ankur", "ranjit", "prijesh", "rahul", "ganesh" };

		StringJoiner sj1 = new StringJoiner(",");

		sj1.add(names[0]).add(names[1]);

		StringJoiner sj2 = new StringJoiner("@");
		sj2.add(names[2]).add(names[3]);

		StringJoiner sj3 = new StringJoiner(":");

		sj3.add(names[4]).add(names[5]);

		sj2.merge(sj3);

		sj1.merge(sj2);

		System.out.println(sj1.toString());

	}
}
