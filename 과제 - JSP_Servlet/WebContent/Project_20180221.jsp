<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-02-21 실습과제</title>
<script type="text/javascript" src="js_20180221.js"></script>
</head>
<body>
	<h3>실습 - 아이디, 패스워드, 이름, 나이, 주소를 입력받는 회원가입 jsp servlet을 만들어보세요.</h3>
	<form method="get" action="Servlet_20180221" name="project_20180221">
		아이디 : <input type="text" name="id" /><br>
		패스워드 : <input type="text" name="pw" /><br>
		이름 : <input type="text" name="name" /><br>
		나이 : <input type="text" name="age" /><br>
		주소 : <input type="text" name="addr" /><br><br>
		<input type="submit" value="전송" onclick="return check()"/>	
	</form>
</body>
</html>