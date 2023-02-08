<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeeIns.jsp</title>
</head>
<body>
<% String a,b,c,d;
CouInsert obj=new CouInsert();%>
<%a=request.getParameter("RollNo");
b=request.getParameter("CourseId");
c=request.getParameter("Month");
d=request.getParameter("Installment");
String ret=obj.InsFees(a, b, c, d);
out.print(ret);
%>
</body>
</html>