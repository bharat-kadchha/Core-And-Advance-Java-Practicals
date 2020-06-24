package leb_4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {
	public static void main(String[] args) throws IOException {

		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("client says :");
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		DatagramSocket datagramSocket = new DatagramSocket();
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.length(), ip, 1111);
		input.close();
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
	}

}
