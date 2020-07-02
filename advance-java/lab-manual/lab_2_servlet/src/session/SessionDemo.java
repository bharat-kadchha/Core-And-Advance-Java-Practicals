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

		PrintWriter pw = resp.getWriter();

		
		resp.setContentType("text/html");
		String s = req.getParameter("name");
		String p = req.getParameter("password");

		if (s.equals("admin")) {
			
			
			HttpSession session = req.getSession();
			session.setAttribute("name", s);
			session.setAttribute("password", p);
			
			
			req.getRequestDispatcher("/servlet/GetSession").forward(req,resp);
		}
		else
		{
			req.getRequestDispatcher("/SessionDemo.jsp").include(req,resp);
			pw.print("session create only for admin user");
		
		}

	}

}
