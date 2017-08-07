<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
	.message{
		text-align: center;
		background-color: red;
		
	}
	body{
		text-align: center;
	}
	.right{
		background-color: green;
	}

</style>

</head>
<body>
	<h1 style="text-align: center">Welcome to the Great Number Game!</h1>
	<div>
	<h2 style="text-align: center">I am thinking of a number between 1 and 100</h2>
	<h2 style="text-align: center">Take a guess!</h2>
			<h2><%= session.getAttribute("randomNumber") %></h2>
		<% if (session.getAttribute("guess") != null) { %>
			<% int guess = (int) session.getAttribute("guess"); %>
			<% int randomNumber = (int) session.getAttribute("randomNumber"); %>
			<% if (guess > randomNumber) { %>
				<div class="message">Too high!</div>
			<% } else if (guess < randomNumber) { %>
				<div class="message">Too low!</div>
			<% } else { %>
				<div class="right">
					<%= guess %> was the right number!
					<br><br>
					<form action="/GreatNumGame/Home" method="POST">
						<input type="submit" value="Play again!">
					</form>
				</div>
			<% } %>
		<% } %>
		
		<form action="/GreatNumGame/Home" method="POST">
			<input type="text" name="guess">
			<br><br>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>