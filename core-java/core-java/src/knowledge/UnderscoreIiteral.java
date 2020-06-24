package knowledge;

public class UnderscoreIiteral {

	// new feature of JDK 7. to separate literal value ,group of digit with
	// underscore.for the increase readability.

	public static void main(String[] args) {

		int inum = 1_00_00_000;
		System.out.println("inum:" + inum);

		long lnum = 1_00_00_000;
		System.out.println("lnum:" + lnum);

		float fnum = 2.10_001F;
		System.out.println("fnum:" + fnum);

		double dnum = 2.10_12_001;
		System.out.println("dnum:" + dnum);

	}

}
