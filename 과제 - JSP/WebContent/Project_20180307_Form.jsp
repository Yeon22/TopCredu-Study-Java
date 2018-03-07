<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-07 jdbc 과제 1</title>
</head>
<body>
	<h2>사원 정보 입력</h2><hr>
	<form method="post" action="Project_20180307.jsp">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" size="20"/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" size="20"/></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" size="20"/></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phone" size="20"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="등록"/></td>
				<td><input type="reset" value="취소"/></td>
			</tr>
		</table>
	</form>
</body>
</html>