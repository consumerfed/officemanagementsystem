<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> O M S </title>
<script type="text/javascript" src="JS/login.js"></script>
<link rel="stylesheet" href="CSS/login.css">
</head>
<body>
<div>
<section class="loginform cf">
<form name="login" action="home.html" method="post" accept-charset="utf-8">
	<ul>
		<li><label for="usermail">Email</label>
		<input type="email" name="username" placeholder="yourname@email.com" required></li>
		<li><label for="password">Password</label>
		<input type="password" name="password" placeholder="password" required></li>
		<li>
		<input type="submit" value="Login"></li>
		<li>${message}</li>
	</ul>
</form>
</section>
</div>
</body>
</html>