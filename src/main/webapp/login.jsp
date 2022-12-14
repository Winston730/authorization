<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="by.tr.conspect.bean.User"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>
</head>
<body>


<%
	User userX = (User) session.getAttribute("user");
	if (userX == null)
	{
		out.println("Вначале зарегистрируйтесь!");
	}
	else 
	{
		if (request.getParameter("login").equals(userX.getLogin()) && request.getParameter("password").equals(userX.getPass()))
			{out.println("ВЫ ВОШЛИ!!!!.");}		
		else
		{out.println("Вы не вошли.");}
	}
%>

<a href="index.jsp"> На главную страницу </a>
</body>
</html>
