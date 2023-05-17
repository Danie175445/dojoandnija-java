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
	<h1>New Ninja</h1>
	<div>
		<form:form action="/ninja" method="post" modelAttribute="ninja">
			<form:label path="dojo">Dojo</form:label>
			<form:errors path="dojo" class="red"/>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos }">
					<form:option value="${dojo.id }" pahth="dojo">
					<c:out value="${dojo.name }"></c:out>
					</form:option>
				</c:forEach>
			</form:select><br />
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName" class="red"/>
			<form:input type="text" path="firstName"/><br />
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName" class="red"/>
			<form:input type="text" path="lastName"/><br />
			<form:label path="age">Age</form:label>
			<form:errors path="age" class="red"/>
			<form:input type="number" path="age"/><br />
			<input type="submit" value="Create"/>
		</form:form>
	</div>
	<a href="/dojo">Create a Dojo</a>
</body>
</html>