<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.martam.json.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hola Json</title>
</head>
<body>
	<%
	String json = "{\"nombre\" : \"Pedro\"}";
	LeerJsonPersona leer = new LeerJsonPersona();
	Persona p1 = leer.getPersona(json);
	System.out.println(p1.getNombre());
	%>
</body>
</html>