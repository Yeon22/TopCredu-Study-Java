<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="fruitSelect.jsp">
		<label for="fruit">과일을 선택하세요.</label><br>
		<select id="fruit" name="fruit">
			<option value="1">사과</option>
			<option value="2">메론</option>
			<option value="3">바나나</option>
		</select>
		<input type="submit" value="전송"/>
	</form>
</body>
</html>