<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
<%@ page import="java.time.LocalDateTime"%>

<%
/*String name= (String)request.getAttribute("name");
Integer id= (Integer)request.getAttribute("EmpId");
LocalDateTime time = (LocalDateTime) request.getAttribute("time");*/
%>

<h1>
Hello, My name is 
<%-- <%= name %> --%>
${name }
</h1>

<h1>Hello my name is Himanshu</h1>
<h1>This is help page</h1>

<h1>
My EmployeeId is 
<%-- <%= id %> --%>
${EmpId }
</h1>

<h1>date and Time is <%-- <%=time %> --%>${time }</h1>

<hr>

<c:forEach var="item" items="${marks }">
<%--<h1>${item }</h1> --%>
<h1><c:out value="${item }"></c:out></h1>
</c:forEach>

</body>
</html>