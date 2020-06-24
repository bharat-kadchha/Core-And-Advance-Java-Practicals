package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket dis = new Socket("localhost", 1122);
		DataOutputStream dos = new DataOutputStream(dis.getOutputStream());
		DataInputStream d = new DataInputStream(dis.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "";
		String s2 = "";
		while (!s1.equals("by")) {

			System.out.println("client says ;");
			s1 = br.readLine();
			dos.writeUTF(s1);
			s2 = d.readUTF();
			System.out.println("client recieve ;" + s2);

		}

		br.close();
		dos.close();
		dis.close();

	}

}
