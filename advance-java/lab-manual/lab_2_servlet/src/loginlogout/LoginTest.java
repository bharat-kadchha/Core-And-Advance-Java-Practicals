package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("text/html");
		HttpSession session = req.getSession();

		printWriter.print("your detail can be set to the session<br>");

		Enumeration enumeration = session.getAttributeNames();

		while (enumeration.hasMoreElements()) {
			String name = (String) enumeration.nextElement();
			printWriter.print(name + " : " + session.getAttribute(name) + "<br>");
		}

		printWriter.print("<br>are you want logout ?");
		printWriter.print("<a href='/leb_2_servlet/login/Logout'>logout </a>");
		
		printWriter.close();
	}
}
