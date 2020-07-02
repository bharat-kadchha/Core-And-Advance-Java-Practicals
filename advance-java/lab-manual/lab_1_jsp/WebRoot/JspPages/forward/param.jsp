<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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

		<title>My JSP 'param.jsp' starting page</title>

	</head>

	<body>
		This is param demo
		<br>

		<%
			out.print("Addition ="
					+ (Integer.parseInt(request.getParameter("n1")) + Integer
							.parseInt(request.getParameter("n2"))));
		%>
	</body>
</html>
