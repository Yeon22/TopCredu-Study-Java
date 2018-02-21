<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>서블릿</title>
</head>
<body>
	<form method="get" action="MethodServlet">
		<input type="submit" value="get 방식으로 호출하기" />
	</form>
	<br>
	<br>
	<form method="post" action="MethodServlet">
		<input type="submit" value="post 방식으로 호출하기" />
	</form>
</body>
</html>