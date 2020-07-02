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
   
   	<form action="/leb_2_servlet/servlet/httpMethod"> 
   	 
   		fname :<input  type="text" name="fname"> <br>
   		lname :<input  type="text" name="lname"><br>
   		passw :<input type="password" name="passw"><br>
   		
   		<input type="submit" value="submit">
   	
   	
   	
   	</form>
   
  </body>
</html>
