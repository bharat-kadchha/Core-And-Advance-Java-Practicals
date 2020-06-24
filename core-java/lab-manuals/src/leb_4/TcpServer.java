package leb_4;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(2222);
		Socket socket = serverSocket.accept();
		serverSocket.close();
		System.out.println("connection established...");

		DataInputStream dataInStream = new DataInputStream(socket.getInputStream());
		String s1 = dataInStream.readUTF();
		System.out.println(s1);
		socket.close();
		dataInStream.close();

	}

}
