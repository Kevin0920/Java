<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Random Words</title>
</head>
<body>
	<div style="text-align: center;">
		
		You have generated a word ${counter} times
		
		<h1> ${randomWord}  </h1>
		<form method="POST" action="/RandomWord/Home">
        			 <button type="submit">Generate!</button>
        </form>
        <hr/>
        ${date}
		
	
	</div>
</body>
</html>