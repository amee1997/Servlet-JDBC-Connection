<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

<% 
boolean status = (boolean)request.getAttribute("user"); 

if(status) {
	        out.print("WELCOME BACK!!!");
			out.print("Login Successfully");

		
		
%>
<%  out.print("Your details are:"); %><br>
<% 
   Iterator itr;
   List myList = (List)request.getAttribute("li");
   itr = myList.iterator();
   
%>
<% out.println("First Name:"+" "+myList.get(0)); %><br>
<% out.println("Last Name:"+" "+myList.get(1)); %><br>
<% out.println("User Name:"+" "+myList.get(2)); %><br>
<% out.println("Email:"+" " +myList.get(3)); %><br>
<% out.println("Number"+" "+myList.get(4)); %><br>
<% }
else{
	out.print("Invalid user name or password!!!!!!!!");
}%>

</body>
</html>