package extra;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;
class Demo
{
	private Demo() {}
}
public class Subarray {

	public static void main(String[] args) {
		int arr[] = { 10, 3, 7 };

		int n = arr.length;
		int x[] = null;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]);
				}

			}
		}

	}
}
