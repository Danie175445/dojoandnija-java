<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1>New Dojo</h1>
	<form:form action="/dojo" method="post" modelAttribute="dojo">
		<form:label path="name">Name:</form:label>
		<form:errors path="name" class="red"/>
		<form:input type="text" path="name"/><br />
		<input type="submit" />
	</form:form>
	<a href="/ninja">Create a Ninja</a>
</body>
</html>