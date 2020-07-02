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

		<title>My JSP 'JspForward.jsp' starting page</title>

	</head>

	<body>
		This is my JSP Forward demo
		<br>

		<jsp:forward page="param.jsp">
			<jsp:params>
				<jsp:param value="10" name="n1" />
				<jsp:param value="20" name="n2" />
			</jsp:params>
		</jsp:forward>


	</body>
</html>
