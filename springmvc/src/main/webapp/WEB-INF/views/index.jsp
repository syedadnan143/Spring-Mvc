<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>this is my home page</h1>
<h1>this is my controller</h1>

<%
String name = (String) request.getAttribute("name");
Integer Id = (Integer) request.getAttribute("Id");
List <String>friends =(List<String>)request.getAttribute("f");
%>

<h1>my name is <%= name %></h1>
<h1>my Id Is <%= Id %></h1>

<%-- <%
for (String s : friends) {
%>
  <h1><%= s %></h1>
<%
}
%> --%>

</body>
</html>
