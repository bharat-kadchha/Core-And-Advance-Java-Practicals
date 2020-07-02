package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetSession extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		HttpSession s=req.getSession();
		pw.print("created "+s.getCreationTime());
		pw.print("\n id="+s.getId());
		pw.print("\n max limit="+s.getMaxInactiveInterval());
		pw.print(s.isNew());
		s.setMaxInactiveInterval(1200);
		pw.print("\n max limit="+s.getMaxInactiveInterval());
		s.removeAttribute("name");
		pw.println("\nhello "+s.getAttribute("name"));
		Enumeration e=s.getAttributeNames();
		while(e.hasMoreElements())
		{
			pw.print("attributes---"+e.nextElement());
		}
		pw.println("your password is "+s.getAttribute("password"));
		
	}

}
