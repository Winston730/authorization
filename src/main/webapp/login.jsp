<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="Controller" method="post">
		<input type="hidden" name="command" value="forward" /> Введите логин:<br />
		<input type="text" name="login" value="" /><br /> Введите пароль:<br />
		<input type="password" name="pass" value="" /><br /> 
		<input type="submit" value="Отправить" /><br />
</form>
	

</body>
</html>