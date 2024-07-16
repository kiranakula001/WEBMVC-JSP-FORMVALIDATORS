<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error{ color:red }

</style>
</head>
<body>
<h3> User Registration</h3>

<form:form  action="register" modelAttribute="user" method="post">
	<table>
	<tr>
		<td>UserName</td>
		<td><form:input path="uname" />
			<form:errors path="uname" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><form:input path="pass" />
			<form:errors path="pass" cssClass="error"/></td>
	</tr>
	<tr>
		<td>EmailId</td>
		<td><form:input path="mail" />
			<form:errors path="mail" cssClass="error"/></td>
	</tr>
	<tr>
		<td>MobileNumber</td>
		<td><form:input path="mno" />
			<form:errors path="mno" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Age</td>
		<td><form:input path="age" />
			<form:errors path="age" cssClass="error"/></td>
	</tr>
	<tr>
		<td><input type="Submit" value="Register" /></td>
	</tr>
	</table>
</form:form>
</body>
</html>