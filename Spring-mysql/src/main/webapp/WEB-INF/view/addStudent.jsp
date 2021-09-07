<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1>Add Student</h1>
		<form:form action="saveStudent" method="GET" modelAttribute="student">

			<label>Name :</lab3el> <form:input path="sname" /> <br>
			<br> <label>Roll Number :</lab3el> <form:input path="rollnum" />
					<br>
				<br> <label>Department :</lab3el> <form:input path="dept" /> <br>
					<br> <label>Email :</lab3el> <form:input path="mail" /> <br>
						<br> <input type="submit" value="ADD" />
		</form:form>
	</div>
</body>
</html>