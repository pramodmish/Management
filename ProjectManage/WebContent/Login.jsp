<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login.jsp</title>
</head>
<body>
<% String a,b; 
CouInsert obj=new CouInsert();%>
<%a=request.getParameter("UserId");
b=request.getParameter("Pass");
String z=obj.AdmiLogin(a,b);
out.print(z+a);%>
</body>
</html>