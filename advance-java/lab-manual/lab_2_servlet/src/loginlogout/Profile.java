package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("text/html");
		HttpSession s = req.getSession();

		if (s != null) {
			printWriter.print("login frist<br>");
			printWriter.print("<a href='/leb_2_servlet/login/l'>login </a>");

			req.getRequestDispatcher("/Login/LoginTest").forward(req, resp);

		} else {

			HttpSession session = req.getSession();
			req.getRequestDispatcher("/LoginDemo.jsp").include(req, resp);
		}
		printWriter.close();
	}
}