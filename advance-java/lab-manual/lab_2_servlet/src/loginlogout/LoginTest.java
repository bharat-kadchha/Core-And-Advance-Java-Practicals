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

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		HttpSession s=req.getSession();

	pw.print("your detail can be set to the session<br>");

	Enumeration e = s.getAttributeNames();

	while (e.hasMoreElements()) {
		String name = (String) e.nextElement();
		pw.print(name + " : " + s.getAttribute(name) + "<br>");
	}

	pw.print("<br>are you want logout ?");
	pw.print("<a href='/leb_2_servlet/login/Logout'>logout </a>");
}
}
