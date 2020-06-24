package basicPrograms;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {

		System.out.println("enter 2 value for below operation :");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		float result;
		System.out.println("enter your Symbol for Operation\n( + = sum, - = minus, * = multiply, / = division )");
		char ch = input.next().charAt(0);
		input.close();
		switch (ch) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		default:
			System.out.print("wrong value inserted");
		}

	}

}
