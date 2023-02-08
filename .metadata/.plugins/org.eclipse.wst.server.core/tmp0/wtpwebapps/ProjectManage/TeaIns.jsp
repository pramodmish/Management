<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TeaIns.jsp</title>
</head>
<body>
<% String a,b,c,d,e,f;
CouInsert obj=new CouInsert();%>
<%a=request.getParameter("TeacherId");
b=request.getParameter("TName");
c=request.getParameter("TAdd");
d=request.getParameter("TPhone");
e=request.getParameter("TEmail");
f=request.getParameter("CourseId");
String ret=obj.InsTeacher(a, b, c, d, e, f);
out.print(ret);
%>
</body>
</html>