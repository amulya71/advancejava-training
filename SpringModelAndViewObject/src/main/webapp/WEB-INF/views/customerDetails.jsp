<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%
	Integer id = (Integer)request.getAttribute("id");
	String firstName = (String)request.getAttribute("firstName");
	String lastName = (String)request.getAttribute("lastName");
	Long contactNumber = (Long)request.getAttribute("contactNumber");
	String location = (String)request.getAttribute("location");
	
	out.print(id);
	out.print(firstName);
	out.print(lastName);
	out.print(contactNumber);
	out.print(location);
	%>
</body>
</html>

