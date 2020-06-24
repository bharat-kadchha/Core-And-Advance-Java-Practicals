package leb_4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {
	public static void main(String[] args) throws UnknownHostException {

		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip);

		InetAddress ip1 = InetAddress.getByName("www.google.com");

		System.out.println("host name " + ip1.getHostName());
		System.out.println(InetAddress.getLocalHost());

		System.out.println("ip address " + ip1.getHostAddress());

		System.out.println("canonical host name " + ip1.getCanonicalHostName());
		System.out.println("site local address ?" + ip1.isSiteLocalAddress());
		System.out.println("isAnyLocalAddress : " + ip1.isAnyLocalAddress());

		System.out.println("isLinkLocalAddress : " + ip1.isLinkLocalAddress());

	}

}
