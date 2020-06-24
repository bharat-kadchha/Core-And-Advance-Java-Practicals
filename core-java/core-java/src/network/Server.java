package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(1122);

		Socket socket = ss.accept();
		ss.close();
		System.out.println("communection establish ....");

		DataInputStream dis = new DataInputStream((socket.getInputStream()));
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = "";
		String s2 = "";

		while (!s1.equals("by")) {
			s1 = dis.readUTF();
			StringBuilder sb = new StringBuilder(s1);
			System.out.println("server recieve ;" + sb.reverse());

			// System.out.println(br.readLine());
			System.out.println("server says ;");
			s2 = br.readLine();
			dos.writeUTF(s2);

		}
		dis.close();
		dos.close();
		socket.close();

	}

}
