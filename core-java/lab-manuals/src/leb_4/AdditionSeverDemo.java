package leb_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AdditionSeverDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {

		ServerSocket serverSocket = new ServerSocket(3333);
		Socket socket = serverSocket.accept();
		serverSocket.close();
		System.out.println("connection done...");

		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		System.out.println("sever side :");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data1 = br.readLine();
		pw.println(data1);
		
		String data2 = br.readLine();
		pw.println(data2);
		
		pw.flush();
		pw.close();
		br.close();
		socket.close();
	}

}
