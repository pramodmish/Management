<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EnqUpd.jsp</title>
</head>
<body>
<% String a,b,c,d,e,f,g;
CouInsert obj=new CouInsert();%>
<%a=request.getParameter("EnquiryId");
b=request.getParameter("EName");
c=request.getParameter("EAdd");
d=request.getParameter("Email");
e=request.getParameter("Phone");
f=request.getParameter("CourseId");
g=request.getParameter("DateofEnquiry");
String ret=obj.UpdEnquiry(a, b, c, d, e, f, g);
out.print(ret);
%>
</body>
</html>