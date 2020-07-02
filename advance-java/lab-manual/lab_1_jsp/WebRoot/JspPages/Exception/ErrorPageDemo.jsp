<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"
	errorPage="/JspPages/ErrorPage.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'ErrorPageDemo.jsp' starting page</title>
	</head>

	<body>
		exception occur in this page

		<%
		int i = 1 / 0;
	%>

	</body>
</html>
