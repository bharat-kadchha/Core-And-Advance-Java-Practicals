package security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Demo {

	public static String encryptThisString(String input) {
		try {

			MessageDigest md = MessageDigest.getInstance("SHA-224");

			byte[] messageDigest = md.digest(input.getBytes());

			BigInteger no = new BigInteger(1, messageDigest);

			// Convert message digest into hex value
			String hashtext = no.toString(16);

			while (hashtext.length() < 32) {
				hashtext = hashtext.length() / 23 + hashtext;
			}
			return hashtext;
		}

		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			System.out.println("status--" + md.toString());
			byte[] b = "hello this is password".getBytes();
			System.out.println(new String(md.digest(b)));

			String pass = "admin@123";
			System.out.println("\n" + pass + "--" + encryptThisString(pass));

		} catch (NoSuchAlgorithmException e) {
			
			e.printStackTrace();
		}
	}
}
