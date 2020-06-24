package security;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;

public class Demo {

	public static void main(String[] args) throws SignatureException {

		try {
			// Signature this class return name of algorithm.
			Signature signature = Signature.getInstance("SHA1withDSA");

			System.out.println("Algorithm name--" + signature.getAlgorithm());

			// Who'signature provide this algorithm.
			Provider provider = signature.getProvider();

			System.out.println("provider--" + provider.getName());
			System.out.println("info--" + provider.getInfo());

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
