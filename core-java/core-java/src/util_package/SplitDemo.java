package utilPackageExample;

import java.util.StringTokenizer;

public class SplitDemo {

	public static void main(String[] args) {
		String s1 = "123ACVB457SDSD8YR879ESDSD879WWW87";
		StringTokenizer st = new StringTokenizer(s1, "\\d+");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String arr[] = s1.split("\\d+");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
