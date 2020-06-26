package util_package;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		byte[] b = new byte[3];
		Random rendom = new Random(1212);
		System.out.println(rendom.nextInt());

		System.out.println(Math.random());

		rendom.nextBytes(b);
		System.out.println(Arrays.toString(b));

		Random random = new SecureRandom();
		System.out.println(random.nextInt(40));

		String s = "abcdefg";
		char c = s.charAt(random.nextInt(s.length()));
		System.out.println(c);
	}
}
