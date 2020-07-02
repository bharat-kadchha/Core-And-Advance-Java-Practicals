package url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlDemo extends HttpServlet{
	
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		
		
		pw.print("this is user data pass to the url..."+name);
		
		pw.print("<a href='/leb_2_servlet/servlet/getUrl?name="+name+"'>click to get data </a>");
		
		
	}

}
