package leb_4;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ChatUDP_Server {
	public static void main(String[] args) throws IOException {

		DatagramSocket datagramSocket = new DatagramSocket(1111);
		Scanner input = new Scanner(System.in);

		while (true) {

			byte data[] = new byte[20];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			datagramSocket.receive(dp);
			String string1 = new String(data);
			System.out.println("client :" + string1);

			InetAddress ip = dp.getAddress();
			int port = dp.getPort();
			System.out.println("server say :");
			String data1 = input.nextLine();
			
			DatagramPacket dp1 = new DatagramPacket(data1.getBytes(), data1.length(), ip, port);
			datagramSocket.send(dp1);
			if (data1.equals("bye")) {
				System.out.println("conenction closed by server");
				break;
			}
		}
		input.close();
		datagramSocket.close();

	}
}
