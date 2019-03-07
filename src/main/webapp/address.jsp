<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.codecool.web.model.Address" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Greeting</title>
</head>
<body>
<h1>Greeting!</h1>
<% List<Address> addresses = (List) request.getAttribute("service"); %>
<% for (Address a : addresses) { %>
    <p><%= a.getEmail() %></p>
<% } %>
<a href="index.html">Go back to the <em>index</em> page.</a>
<br>
</body>
</html>
