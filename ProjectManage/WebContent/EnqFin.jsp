<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.System.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EnqFin.jsp</title>
</head>
<body>
<% String a;
CouInsert obj=new CouInsert();%>
<% a=request.getParameter("EnquiryId");
String ret=obj.FinEnquiry(a);
out.print(ret);%>
</body>
</html>