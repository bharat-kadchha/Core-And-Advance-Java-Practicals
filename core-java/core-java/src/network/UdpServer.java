package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {

	public static void main(String[] args) throws IOException {

		byte data[] = new byte[20];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		DatagramSocket ds = new DatagramSocket(1111);
		ds.receive(dp);
		StringBuilder sb = new StringBuilder("hello");
		sb.reverse();
		System.out.println(sb);
		ds.close();
	}

}
