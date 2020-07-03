package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (name.equals("admin")) {

			HttpSession session = req.getSession();
			session.setAttribute("name", name);
			session.setAttribute("password", password);

			req.getRequestDispatcher("/servlet/GetSession").forward(req, resp);
		} else {
			req.getRequestDispatcher("/SessionDemo.jsp").include(req, resp);
			printWriter.print("session create only for admin user");

		}
		printWriter.close();

	}

}
