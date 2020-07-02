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

		PrintWriter pw = resp.getWriter();

		
		resp.setContentType("text/html");
		String s = req.getParameter("name");
		String p = req.getParameter("password");
		
		
		if (s.equals("admin")) {
			
			
			HttpSession session = req.getSession();
			//if(session.isNew())
			{session.setAttribute("name", s);
			session.setAttribute("password", p);
			session.setAttribute("country","india");
			session.setAttribute("mail","admin@gmail.com");
			session.setAttribute("id", session.getId());
			
			session.setMaxInactiveInterval(10);
			
			
			pw.print("hello "+session.getAttribute("name"));
			pw.print("<br>you are log in over site ...");
			pw.print("<br>can you see the ...");
			pw.print("<a href='/leb_2_servlet/login/Profile'>profie</a>");
			pw.print("<br>can you go to  the ...");
			pw.print("<a href='/leb_2_servlet/login/Logout'>logout</a>");
			
			//req.getRequestDispatcher("/login/profile").forward(req,resp);
			}
//		else
		//	{
			//	pw.print("frist logout");
	//		}
		}
		else
		{
			req.getRequestDispatcher("/LoginDemo.jsp").include(req,resp);
			pw.print("<b>session create only for admin user</b>");
			
		
		}

	}


}
