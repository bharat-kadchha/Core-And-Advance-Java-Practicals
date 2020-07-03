package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("text/html");
		HttpSession session = req.getSession();

		if (session != null) {
			session.invalidate();
			printWriter.print("you are logout");
			printWriter.print("<br>go to login page ..<a href='/leb_2_servlet/LoginDemo.jsp'>login</>");
		}

		printWriter.close();
	}
}
