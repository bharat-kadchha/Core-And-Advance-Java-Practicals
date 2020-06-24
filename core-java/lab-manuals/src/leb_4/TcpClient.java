package leb_4;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 2222);
		DataOutputStream dataOutStream = new DataOutputStream(socket.getOutputStream());
		System.out.println("client say :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		dataOutStream.writeUTF(data);

		dataOutStream.close();
		socket.close();
		br.close();

	}
	
}
