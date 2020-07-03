package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodsOfReq extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();

		Enumeration enumeration = req.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String name = (String) enumeration.nextElement();
			printWriter.print("\n" + name + " : " + req.getParameter(name));

		}
		req.setAttribute("ip :", "1.0.0.127");

		printWriter.print("\nip :" + req.getAttribute("ip :"));

		printWriter.print("\n");

		req.setCharacterEncoding("ISO-8859-1");

		printWriter.print(req.getCharacterEncoding());

		printWriter.print(req.getHeader("Host"));

		printWriter.print("\nlocal add--" + req.getLocalAddr() + "\nlocalname--"
				+ req.getLocalName() + "\nlocalport--" + req.getLocalPort());

		printWriter.print("\nmethod--" + req.getMethod() + "\n--" + req.getPathInfo()
				+ req.getPathTranslated());

		printWriter.print("\nprotocol--" + req.getProtocol());

		printWriter.print("\nquery String--" + req.getQueryString());

		printWriter.print("\nremoteport--" + req.getRemotePort() + "\nremoteAdd--"
				+ req.getRemoteAddr());
		printWriter.print("\nURL--" + req.getRequestURI());

		printWriter.print("\nscheme--" + req.getScheme() + "\nserverName--"
				+ req.getServerName() + "\nport--" + req.getServerPort()
				+ "\nserverPath--" + req.getServletPath());
		printWriter.print("\n--" + req.FORM_AUTH + req.DIGEST_AUTH);

		printWriter.print("\n--- header info ---");

		printWriter.print("\n");

		Enumeration enumeration2 = req.getHeaderNames();
		while (enumeration2.hasMoreElements()) {
			String hname = (String) enumeration2.nextElement();
			printWriter.print("\t" + hname + " : " + req.getHeader(hname) + "\n");

		}
		printWriter.print("\nlocale--" + req.getLocale());
		printWriter.print("\nsecure--" + req.isSecure());
		req.removeAttribute("ip");
		printWriter.print("\n");
		
		printWriter.close();

	}

}
