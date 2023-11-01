<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert help here</title>
</head>
<body bgcolor="bottel guard">
<h1>hi there is model and view</h1>

<%
   // String name =(String)request.getAttribute("name");
   // Integer id =(Integer)request.getAttribute("id");
   
  

%>

  <h1> welcome  <%-- <%=  name  %> --%> ${name}</h1>
  <h1>my id is  ${id}
   <%-- <%=id %> --%>
   </h1>
</body>
</html>