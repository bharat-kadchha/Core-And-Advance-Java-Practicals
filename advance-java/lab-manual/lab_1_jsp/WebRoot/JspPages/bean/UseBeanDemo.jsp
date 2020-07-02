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

		<title>My JSP 'UseBeanDemo.jsp' starting page</title>

	</head>

	<body>
		Student Information (name,en,age) as below
		<br>

		<jsp:useBean id="stud" class="com.StudentInfoBean" scope="page" />

		<jsp:setProperty property="name" name="stud" value="bharat" />
		<jsp:setProperty property="en" name="stud" value="018" />
		<jsp:setProperty property="age" name="stud" value="20" />
		using java action
		<br>
		<ul>
			<li>
				name :<jsp:getProperty property="name" name="stud" /></li>
			<li>
				enroll :<jsp:getProperty property="en" name="stud" /></li>
			<li>
				age :<jsp:getProperty property="age" name="stud" /></li>
		</ul>

		using scriptlet tag
		<br>
		<%
			stud.setAge(20);
			stud.setEn(18);
			stud.setName("Bharat");
		%>
		<ul>
			<li>
				name :<%
				out.print(stud.getName());
			%>
			</li>
			<li>
				age :<%
				out.print(stud.getAge());
			%>
			</li>
			<li>
				enroll :<%
				out.print(stud.getEn());
			%>
			</li>
		</ul>
	</body>
</html>
