<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-07 jdbc 과제 2</title>
</head>
<body>
	<h2>상품 등록</h2><hr>
	<form method="post" action="product_20180307.jsp">
		<table>
			<tr>
				<td>상품 아이디</td>
				<td><input type="text" name="proid" size="20"/></td>
			</tr>
			<tr>
				<td>상품 이름</td>
				<td><input type="text" name="proname" size="20"/></td>
			</tr>
			<tr>
				<td>상품 가격</td>
				<td><input type="text" name="price" size="20"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="등록"/></td>
				<td><input type="reset" value="취소"/></td>
			</tr>
		</table>
	</form>
</body>
</html>