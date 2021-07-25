<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>  
<form:form action="/login" modelAttribute="user">  
Username: <form:input path="username"/> <br><br>  
<form:errors path="username" cssClass="error"/><br><br>
Password(*): <form:password path="password"/>  
  
<form:errors path="password" cssClass="error"/><br><br>
Email: <form:input path="email"/> <br><br>  
<form:errors path="email" cssClass="error"/><br><br>
Contact: <form:input path="contact"/> <br><br>  
<form:errors path="contact" cssClass="error"/><br><br>
City: <form:select path="city">  
        <form:option value="Ghaziabad" label="Ghaziabad"/>  
        <form:option value="Modinagar" label="Modinagar"/>  
        <form:option value="Meerut" label="Meerut"/>  
        <form:option value="Amristar" label="Amristar"/>  
        </form:select>  <br><br>
<form:errors path="city" cssClass="error"/><br><br>
Zipcode: <form:input path="zip"/> <br><br>  
<form:errors path="zip" cssClass="error"/><br><br>
  
<input type="submit" value="submit">  
</form:form>  
</body>  
</html>  


 <!--<form action="/login" method="post">
Your username<input type="text" name ="username" ><br>

Password<input type="password" name ="password" ><br>
Email<input type="email" name ="email" >
<input type="submit" value="Login">

 

</form> -->


