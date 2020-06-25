package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpChatServer {
	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(1122);

		Socket s = serverSocket.accept();
		serverSocket.close();
		System.out.println("communection establish ....");

		DataInputStream dataInStream = new DataInputStream((s.getInputStream()));
		DataOutputStream dataOutStream = new DataOutputStream(s.getOutputStream());

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String s1 = "";
		String s2 = "";

		while (!s1.equals("by")) {
			s1 = dataInStream.readUTF();
			System.out.println("server recieve ;" + s1);

			// System.out.println(bufferedReader.readLine());
			System.out.println("server says ;");
			s2 = bufferedReader.readLine();
			dataOutStream.writeUTF(s2);

		}
		dataInStream.close();
		dataOutStream.close();
		s.close();

	}

}
