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
    
		<h4>welcome to validation system</h4>
		<p>enter your no</p>
		<form action="/leb_2_servlet/servlet/Collobration">
			
			<input type="text" name="no"><br>
			<input type="submit" value="squere"> 
		
		
		
		</form>
  </body>
</html>
