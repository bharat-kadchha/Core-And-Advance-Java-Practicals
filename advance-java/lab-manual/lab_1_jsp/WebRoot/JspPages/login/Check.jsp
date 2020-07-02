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

		<title>My JSP 'Check.jsp' starting page</title>

	</head>

	<body>
		<%
			if (request.getParameter("name").equals("admin") && request.getParameter("pass").equals("admin")) {
		%>
			<jsp:forward page="Match.jsp"></jsp:forward>
		<%
			}
			else {
		%>
			<jsp:forward page="LoginPage.jsp"></jsp:forward>
		<%
			}
		%>

	</body>
</html>
