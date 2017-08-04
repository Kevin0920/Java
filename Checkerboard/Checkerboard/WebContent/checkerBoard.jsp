<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo JSP</title>
        <link href="/Checkerboard/index.css" media="all" rel="stylesheet" />
        
    </head>
<body>

    <!-- getting the value for the name parameter -->
   
   
    		<% int height = Integer.parseInt(request.getParameter("height")); %>
    		<% int width = Integer.parseInt(request.getParameter("width")); %>
    		
		<h1>Checkerboard: <%= width %>w X <%= height %>h</h1>
    	
    <!-- displaying the value -->
 <%--    <h1><%= width %></h1>
    <h1><%= height %></h1>
	 --%>
    <!-- this is a declaration tag for methods -->
   <%String html = ""; %>
	   <%   for(int i = 0; i<= width ; i++ ) {  %>
	   	 <%   for(int y = 0; y<= height; y++ ) {  %>
		   <% if((i+y)%2 == 0) { %> 
			   	<% html += "<div class='pinkbox'></div>"; %>
				   <% } else { %> 
				   	 <% html += "<div class='bluebox'></div>"; %>
				   <% } %>
			   <% } %>
			   <%html += "<br>"; %>
		<%  } %>
    <%= html %>


    <!-- here we have to import the Date class. You will put the import in the first line of the jsp tag. Use the import attribute -->

</body>
</html>