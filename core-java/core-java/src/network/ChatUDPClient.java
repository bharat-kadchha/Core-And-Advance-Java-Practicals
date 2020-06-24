package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatUDPClient {
	public static void main(String[] args) throws Exception {

		InetAddress ip = InetAddress.getLocalHost();
		DatagramSocket ds = new DatagramSocket();

		while (true) {
			System.out.println("client say :");
			Scanner scanner = new Scanner(System.in);
			String data = scanner.nextLine();
			scanner.close();
			DatagramPacket dp = new DatagramPacket(data.getBytes(), data.length(), ip, 1111);
			ds.send(dp);
			if (data.equals("bye")) {
				System.out.println("coonection closed by client");
				break;
			}

			byte data1[] = new byte[20];
			DatagramPacket dp1 = new DatagramPacket(data1, data1.length);
			ds.receive(dp1);
			String s2 = new String(data1);
			System.out.println("sever :" + s2.trim());
		}
		ds.close();

	}
}
