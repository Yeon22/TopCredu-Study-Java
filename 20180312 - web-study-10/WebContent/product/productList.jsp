<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/shopping.css">
</head>
<body>
	<div id="wrap" align="center">
		<h1>상품 리스트 - 관리자 페이지</h1>
		<table class = "list">
			<tr>
				<td colsapn="5" style="border:white; text-align:right">
					<a href="productWrite.do">상품등록</a>
				</td>
			</tr>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>가격</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="product" items="${productList}">
				<tr class="record">
					<td>${product.code}</td>
					<td>${product.name}</td>
					<td>${product.price}원</td>
					<td><a href="productUpdate.do?code=${product.code}">상품 수정</a></td>
					<td><a href="productDelete.do?code=${product.code}">상품 삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>