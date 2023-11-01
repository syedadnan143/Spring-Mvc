<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc}</p>
<h1 style="color:blue">${msg}</h1>
<hr>

 <h1> your name is ${data.name}</h1>
 <h1>your email is...${data.email}</h1>
 <h1>your password is...${data.password}</h1>
</body>
</html>