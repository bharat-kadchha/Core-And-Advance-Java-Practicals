package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatUDPServer {
	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket(1111);
		Scanner s = new Scanner(System.in);

		while (true) {

			byte data[] = new byte[20];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			ds.receive(dp);
			String s1 = new String(data);
			System.out.println("client :" + s1.trim());

			InetAddress ip = dp.getAddress();
			int port = dp.getPort();
			// System.out.println(port);
			System.out.println("server say :");
			String data1 = s.nextLine();
			DatagramPacket dp1 = new DatagramPacket(data1.getBytes(), data1.length(), ip, port);
			ds.send(dp1);
			if (data1.equals("bye")) {
				System.out.println("conenction closed by server");
				break;
			}
		}
		s.close();
		ds.close();

	}
}
