<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo JSP</title>
        <link href="/Checkerboard/index.css" media="all" rel="stylesheet" />
        
    </head>
<body>

    <!-- getting the value for the name parameter -->
   
   
    		<% String height = request.getParameter("height"); %>
    		<% String width = request.getParameter("width"); %>
    		<%if(height == null || width == null)  { %>
    			<% height = "1"; %>
    			<% width = "1"; %>
    		<% } %>

    <!-- displaying the value -->
    <h1><%= width %></h1>
    <h1><%= height %></h1>
	
    <!-- this is a declaration tag for methods -->
   <%   for(int i = 0; i<= Integer.parseInt(height); i++ ) {  %>
   	 <%   for(int y = 0; y<= Integer.parseInt(width); y++ ) {  %>
	   <% if((i+y)%2 == 0) { %> 
		   	<div class="pinkbox"> 
			   <% } else { %> 
			   		<div class="bluebox"> 
			   <% } %>
		   <% } %>
	 	 </div>
	  </div>
	<%  } %>
    


    <!-- here we have to import the Date class. You will put the import in the first line of the jsp tag. Use the import attribute -->
    <p>The time is: <%= new Date() %></p>
</body>
</html>