<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project 3</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="login">
	    <form method="post" action="servlet.jsp" class="form1">		
			<h1>Login</h1>
			<div id=msg></div>
			<label>Enter your name</label>
			<input type="text" value="" name="username" id="username">
			<label>Enter your password</label>
			<input type="password" value="" name="password" id="password">
		<div class="submit">
			<button type="submit">Login</button>
		</div>
		</form>
   </div>
</body>
</html>