<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-06 JSP 과제</title>
</head>
<body>
	<h2>과일 가게</h2><hr>
	<form action="itemWrite_20180306.jsp">
		<table>
			<tr>
				<td>과일 이름 : </td>
				<td><input type="text" name="name" id="name"/></td>
			</tr>
			<tr>
				<td>과일 가격 : </td>
				<td><input type="text" name="price" id="price"/></td>
			</tr>
			<tr>
				<td>과일 설명 : </td>
				<td><input type="text" name="description" id="description"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="등록"/></td>
				<td><input type="reset" value="취소"/></td>
			</tr>
		</table>
	</form>
</body>
</html>