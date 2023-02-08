<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TeaDel.jsp</title>
</head>
<body>
<% String a;
CouInsert obj=new CouInsert();%>
<%a=request.getParameter("TeacherId");
String ret=obj.DelTeacher(a);
out.print(ret);
%>
</body>
</html>