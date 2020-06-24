package leb_4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {

	public static void main(String[] args) throws IOException {

		byte data[] = new byte[20];
		DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
		DatagramSocket datagramSocket = new DatagramSocket(1111);
		datagramSocket.receive(datagramPacket);
		System.out.println(new String(data));
		datagramSocket.close();
	}

}
