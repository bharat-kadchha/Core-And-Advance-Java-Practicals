<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body>
   	<p>welcome to over login page </p>
    	<form action="/leb_2_servlet/login/CheckDemo">
    	
    	
    	username : <input type="text" name="name"><br>
    	password : <input type="password" name="password"><br>
    	
    	<input type="submit" value="login">
    	</form>
  </body>
</html>
