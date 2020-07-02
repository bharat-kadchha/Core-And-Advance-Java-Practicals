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

		<title>My JSP 'ScriptingElement.jsp' starting page</title>

	</head>

	<body>
		This is scripting element jsp file.
		<br>

		<!--  html comment -->
		<%-- JSP comment --%>
		<%!int a = 5;

	class demo {
	}

	int add(int i, int b) {
		return (i + b);
	}%>

		<%
			int b = 5;
			a = a + 10;
			b = b + 5;
			out.print("b=" + b);
			out.print("a=" + a);
			out.print("method =" + add(a, b));
		%>
		<%="a+b=" + (a + b)%>

	</body>
</html>
