<%--
  Created by IntelliJ IDEA.
  User: RUSLAN77
  Date: 18.01.2018
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>implicit Guru JSP8</title>
</head>
<body>
<% String name = (String)session.getAttribute("user");
    out.println("User Name is " +name);
%>
</body>
</html>
