<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
.form{
margin-left:10%;
padding:1%;
}
body{
background-repeat:no-repeat;
width:100%;

}
</style>
</head>
<body background="img.jpg">
<div class="form">
<h2>Login Form</h2>
<form action="/MyProject/LoginServlet" method="post">
UserName:<input type="text" id="name" name="uname" required="required" placeholder="username"><br>
<p id="demo1"></p>
Password:<input type="password" id="pass" name="password" required="required" placeholder="password"><br>
<p id="demo2"></p>
<input type="submit" value="Submit"><br><br>
<br>


</form><a href="#">Forgot Password</a>&nbsp&nbsp&nbsp&nbsp&nbsp<a href="index.jsp">Back</a><br>
New user:<a href="Register.jsp">Click here</a>
</div>
</body>
</html>