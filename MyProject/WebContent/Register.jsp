<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web project</title>
</head>
<body>
<div class="main">
<h1>Please Register..</h1>
<form action="/MyProject/RegisterServlet" method="post">
First Name:<input type="text" name="fname" required="required" placeholder="first name"><br><br>
Last Name:<input type="text" name="lname" required="required" placeholder="last name"><br><br>
User Name:<input type="text" name="name" required="required" placeholder="user name"><br><br>
Password:<input type="password" name="pwd" required="required" placeholder="password"><br><br>
Email:<input type="email" name="email" required="required" placeholder="email"><br><br>
Mobile No:<input type="text" name="number" required="required" placeholder="mobile no."><br><br>
<input type="submit" value="Submit">

</div>
</body>
</html>