package leb_4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatUDPClient {
	public static void main(String[] args) throws Exception {

		InetAddress ip = InetAddress.getLocalHost();
		DatagramSocket datagramSocket = new DatagramSocket();

		while (true) {
			System.out.println("client say :");
			Scanner s = new Scanner(System.in);
			String data = s.nextLine();
			s.close();
			DatagramPacket dp = new DatagramPacket(data.getBytes(), data.length(), ip, 1111);
			datagramSocket.send(dp);
			if (data.equals("bye")) {
				System.out.println("coonection closed by client");
				break;
			}

			byte data1[] = new byte[20];
			DatagramPacket dp1 = new DatagramPacket(data1, data1.length);
			datagramSocket.receive(dp1);
			String string2 = new String(data1);
			System.out.println("sever :" + string2);
		}
		datagramSocket.close();

	}
}
