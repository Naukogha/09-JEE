
<%@ page import="org.example.exo2.Personne" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Marie
  Date: 10/01/2025
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%
  List<Personne> personnes = (List<Personne>) request.getAttribute("personnes");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personne</title>
</head>
<body>
<h1><%= "Liste de personne" %>
</h1>
<br/>
<table>
  <thead>
  <tr>
    <th>ID</th>
    <th>Nom</th>
    <th>Prenom</th>
    <th>Age</th>
  </tr>
  </thead>
  <tbody>
  <% for (Personne personne : personnes) { %>
  <tr>
    <td><%= personne.getId() %></td>
    <td><%= personne.getNom() %></td>
    <td><%= personne.getPrenom() %></td>
    <td><%= personne.getAge() %></td>

  </tr>
  <% } %>
  </tbody>
</table>

</body>
</html>
