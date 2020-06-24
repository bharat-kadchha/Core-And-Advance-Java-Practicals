package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {
	public static void main(String[] args) throws IOException {

		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("enter data :");
		Scanner scanner = new Scanner(System.in);
		String data = scanner.next();
		scanner.close();
		DatagramSocket ds = new DatagramSocket();
		DatagramPacket dp = new DatagramPacket(data.getBytes(), data.length(), ip, 1111);

		ds.send(dp);
		ds.close();
	}

}
