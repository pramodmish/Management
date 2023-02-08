<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String a,b,c,d;
CouInsert obj=new CouInsert();%>
<% a=request.getParameter("CourseId");
b=request.getParameter("CName");
c=request.getParameter("Duration");
d=request.getParameter("Fees");
String ret=obj.InsCourse(a, b, c, d);
out.print(ret);
%>
</body>
</html>