<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body bgcolor='rgba(0,0,255,0.03)'>
	<%!
		int c = 3;
	%>
	<%
		
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		
		int result = a + b;
		
		out.println("Output: " + result + "<br>");
	%>
	My variable is <%=c %>
</body>
</html>