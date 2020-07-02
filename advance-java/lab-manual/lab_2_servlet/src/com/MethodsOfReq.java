package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MethodsOfReq  extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		Enumeration e=req.getParameterNames();
		while(e.hasMoreElements())
		{
			String name=(String) e.nextElement();
			pw.print("\n"+name+" : "+ req.getParameter(name));
			
		}
		req.setAttribute("ip :","1.0.0.127");
		pw.print("\nip :"+req.getAttribute("ip :"));
		pw.print("\n");
		req.setCharacterEncoding("ISO-8859-1");
		pw.print(req.getCharacterEncoding());
		
		pw.print(req.getHeader("Host"));
		pw.print("\nlocal add--"+req.getLocalAddr()+"\nlocalname--"+req.getLocalName()+"\nlocalport--"+req.getLocalPort());
		pw.print("\nmethod--"+req.getMethod()+"\n--"+req.getPathInfo()+req.getPathTranslated());
		pw.print("\nprotocol--"+req.getProtocol());
		pw.print("\nquery String--"+req.getQueryString());
		pw.print("\nremoteport--"+req.getRemotePort()+"\nremoteAdd--"+req.getRemoteAddr());
		pw.print("\nURL--"+req.getRequestURI());
		pw.print("\nscheme--"+req.getScheme()+"\nserverName--"+req.getServerName()+"\nport--"+req.getServerPort()+"\nserverPath--"+req.getServletPath());
		pw.print("\n--"+req.FORM_AUTH+req.DIGEST_AUTH);
		pw.print("\n--- header info ---");
		pw.print("\n");
		Enumeration h=req.getHeaderNames();
		while(h.hasMoreElements())
		{
			String hname=(String) h.nextElement();
			pw.print("\t"+hname+" : "+ req.getHeader(hname)+"\n");
			
		}
		pw.print("\nlocale--"+req.getLocale());
		pw.print("\nsecure--"+req.isSecure());
		req.removeAttribute("ip");
		pw.print("\n");
		
	}

}
