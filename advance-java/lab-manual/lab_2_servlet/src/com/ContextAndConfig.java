package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ContextAndConfig extends HttpServlet{
	
	
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		ServletConfig sc=getServletConfig();
		Enumeration e =sc.getInitParameterNames();
		
		while(e.hasMoreElements())
		{
			pw.print(sc.getInitParameter((String) e.nextElement()));
		}
	
		ServletContext context=getServletContext();
		
		pw.print(context.getInitParameter("city"));
		
		
	}

}
