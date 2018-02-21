<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>데이터 전달 서블릿</title>
</head>
<body>
	<form method="get" action="ParamServlet" name="frm">
		아이디 : <input type="text" name="id" /><br>
		나 &nbsp;이 : <input type="text" name="age" /><br>
		<input type="submit" value="전송" />
	</form>
</body>
</html>