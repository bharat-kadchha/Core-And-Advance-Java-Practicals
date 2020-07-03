package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Hello extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		try {
			JspWriter out = this.getJspContext().getOut();
			out.println("Hola");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
