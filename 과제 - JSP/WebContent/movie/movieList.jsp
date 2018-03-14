<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 게시판</title>
<link rel="stylesheet" type="text/css" href="../movieCSS/movieStyle.css">
</head>
<body id="body">
	<div id="wrap" align="center">
		<h1>영화 리스트</h1>
		<table class="list">
			<tr>
				<td colspan="6" style="border:white; text-align: right;">
					<a href="movieWrite.do" id="mu">영화 등록</a>
				</td>
			</tr>
			<tr>
				<th>번호</th>
				<th>영화제목</th>
				<th>감독</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="movie" items="${movieList}">
				<tr class="record">
					<td>${movie.code}</td>
					<td>${movie.name}</td>
					<td>${movie.supervisor}</td>
					<td><a href="movieUpdate.do?code=${movie.code}">영화 수정</a></td>
					<td><a href="movieDelete.do?code=${movie.code}">영화 삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>