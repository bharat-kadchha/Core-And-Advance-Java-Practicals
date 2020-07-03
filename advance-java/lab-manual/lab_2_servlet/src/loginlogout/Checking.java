package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Checking extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String pass = req.getParameter("password");

		if (name.equals("admin")) {

			HttpSession session = req.getSession();
			if (session.isNew()) {
				session.setAttribute("name", name);
				session.setAttribute("password", pass);
				session.setAttribute("country", "india");
				session.setAttribute("mail", "admin@gmail.com");
				session.setAttribute("id", session.getId());

				session.setMaxInactiveInterval(10);

				printWriter.print("hello " + session.getAttribute("name"));
				printWriter.print("<br>you are log in over site ...");
				printWriter.print("<br>can you see the ...");
				printWriter.print("<a href='/leb_2_servlet/login/Profile'>profie</a>");
				printWriter.print("<br>can you go to  the ...");
				printWriter.print("<a href='/leb_2_servlet/login/Logout'>logout</a>");

				req.getRequestDispatcher("/login/profile").forward(req, resp);
			} else {
				printWriter.print("frist logout");
			}
		} else {
			req.getRequestDispatcher("/LoginDemo.jsp").include(req, resp);
			printWriter.print("<b>session create only for admin user</b>");

		}
		printWriter.close();
	}

}
