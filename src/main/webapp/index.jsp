<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here  </title>
</head>
<body>

	<p>Авторизация :</p>
	<form action="login.jsp" method="post">
	<label for="login">Введите свой логин:     </label>
	<input type="text" name="login"> <br>
	<label for="password">Введите свой пароль: </label>
	<input type="password" name="password"> <br>
	<input type="submit" value="Войти"> <br>
	</form>
	

	<form action="reg.jsp" method="post">
	<input type="submit" value="Регистрация">
	</form>
	
</body>
</html>
