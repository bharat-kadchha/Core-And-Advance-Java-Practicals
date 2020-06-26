package operator_and_loop;

public class EnhencedForLoop {

	// foreach loop for traverse the value only
	public static void main(String[] args) {
		int[] no = { 10, 20, 30, 40, 50 };

		int sum = 0;
		for (int a : no) // for(declaration : obj) here check the no. is a is int then print
		{
			sum += a;

		}
		System.out.println(sum + "\n");
	}

}
