<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String a,b,c,d,e,f,g;
CouInsert obj=new CouInsert();%>
<%a=request.getParameter("RollNo");
b=request.getParameter("Name");
c=request.getParameter("Address");
d=request.getParameter("Phone");
e=request.getParameter("CourseId");
f=request.getParameter("DateofAdm");
g=request.getParameter("Remarks");
String ret=obj.InsAdmission(a, b, c, d, e, f, g);
out.print(ret);
%>
</body>
</html>