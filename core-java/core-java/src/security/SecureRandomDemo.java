package security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class SecureRandomDemo {

	public static void main(String[] args) {

		try {
			// Every time Secure Random class will generate random output.
			// used for encryption and decryption
			SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");

			String str = "john cina";

			byte[] b = str.getBytes();

			System.out.println("before--" + Arrays.toString(b));

			sr.nextBytes(b);
			System.out.println("after--" + Arrays.toString(b));

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
