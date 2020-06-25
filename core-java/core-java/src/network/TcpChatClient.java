package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 1122);

		DataOutputStream dataOutStream = new DataOutputStream(socket.getOutputStream());
		DataInputStream dataInStream = new DataInputStream(socket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "";
		String s2 = "";
		while (!s1.equals("by")) {

			System.out.println("client says ;");
			s1 = bufferedReader.readLine();
			dataOutStream.writeUTF(s1);
			s2 = dataInStream.readUTF();
			System.out.println("client recieve ;" + s2);

		}

		bufferedReader.close();
		dataOutStream.close();
		socket.close();

	}

}
