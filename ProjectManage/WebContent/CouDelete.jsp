<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CouDelete.jsp</title>
</head>
<body>
<% String a,b,c,d;
CouInsert obj=new CouInsert();%>
<% a=request.getParameter("CourseId");
String ret=obj.DelCourse(a);
out.print(ret);%>
</body>
</html>