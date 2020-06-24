package leb_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class AdditionClientDemo {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost", 3333);

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		int num1 = Integer.parseInt(br.readLine());

		int num2 = Integer.parseInt(br.readLine());
		System.out.println("client side :");
		System.out.println("sum :" + (num1 + num2));

		socket.close();
		br.close();

	}

}
