package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class GenericDemo extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		
		PrintWriter printWriter=res.getWriter();
		printWriter.print("this is generic service method");
		
		Enumeration enumeration= getInitParameterNames();
		
		while(enumeration.hasMoreElements())
		{
			String name=(String) enumeration.nextElement();
			printWriter.print("\nname="+name);
			printWriter.print("\nvalue="+getInitParameter(name));
		}
	}

	
	
}
