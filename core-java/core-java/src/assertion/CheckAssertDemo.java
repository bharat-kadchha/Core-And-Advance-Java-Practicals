package assertion;

import java.util.Scanner;

public class CheckAssertDemo {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			int num = sc.nextInt();
			assert num > 20 : "out of range";
			System.out.println(num);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
