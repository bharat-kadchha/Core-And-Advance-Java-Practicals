package array;

import java.util.Arrays;

public class ArraysFunction {

	public static void main(String[] args) {

		int num[] = { 23, 56, 12, 32, 90, 87, 56, 24, 03, 06 };
		
		System.out.println("unsorted-" + Arrays.toString(num));
		
		Arrays.sort(num);
		System.out.println("sorted-" + Arrays.toString(num));

		int a = 32;
		System.out.println(a + " at index " + Arrays.binarySearch(num, a));

		int num1[] = { 23, 56, 12, 32, 90, 87, 56, 24, 03, 06 };

		System.out.println(Arrays.equals(num, num1));
		System.out.println(num == num1);
		
		
		int[] num2=Arrays.copyOf(num1, num1.length);
		
		System.out.println(Arrays.toString(num2));
		
		
		Arrays.fill(num1, 100);
		System.out.println(Arrays.toString(num1));
		
		
	
		

	}

}
