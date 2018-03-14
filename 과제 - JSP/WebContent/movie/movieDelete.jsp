<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 삭제 페이지</title>
<link rel="stylesheet" type="text/css" href="../movieCSS/movieStyle.css">
</head>
<body id="body">
	<div id="wrap" align="center">
		<h1>영화 삭제</h1>
		<form method="post" action="movieDelete.do">
			<table id="wrap_table">
				<tr>
					<td>
						<c:choose>
							<c:when test="${empty movie.pictureUrl}">
								<img src="../movieImg/noimage.gif">
							</c:when>
							<c:otherwise>
								<img src="../movieImg/${movie.pictureUrl}">
							</c:otherwise>
						</c:choose>
					</td>
					<td>
						<table id="deltd">
							<tr>
								<th>영화 제목</th>
								<td>
									${movie.name}
								</td>
							</tr>
							<tr>
								<th>감독</th>
								<td>
									${movie.supervisor}
								</td>
							</tr>
							<tr>
								<th>출연배우</th>
								<td>
									${movie.actor}
								</td>
							</tr>
							<tr>
								<th style="width:90px; height: 220px;">줄거리</th>
								<td>
									${movie.description}
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br>
			<input type="hidden" name="code" value="${movie.code}"/>
			<input type="submit" value="삭제"/>
			<input type="button" value="목록" onclick="location.href='movieList.do'"/>
		</form>
	</div>
</body>
</html>