<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Counter</title>
</head>
<body>
	<form action="/Counter/Counter" method="POST">
	
		<button type="submit">Click me!</button>
		<h1>You have clicked the button <%= session.getAttribute("clicks") %> times</h1>
	
	
	</form>
</body>
</body>
</html>