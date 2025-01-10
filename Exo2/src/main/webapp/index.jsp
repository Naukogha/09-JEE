<%@ page import="org.example.exo2.Personne" %>
<%@ page import="java.util.List" %>

<%
    List<Personne> personnes = (List<Personne>) request.getAttribute("personnes");
%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello" %>
</h1>
<br/>

</body>
</html>