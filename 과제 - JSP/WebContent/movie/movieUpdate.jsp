<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-13 과제</title>
<link rel="stylesheet" type="text/css" href="../movieCSS/movieStyle.css">
<script type="text/javascript" src="../movieScript/movie.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>영화 수정</h1>
		<form method="post" action="movieUpdate.do" enctype="multipart/form-data" name="frm">
			<input type="hidden" name="code" value="${movie.code}"/>
			<input type="hidden" name="nanmarkeImg" value="${movie.pictureUrl}"/>
			<table>
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
						<table>
							<tr>
								<th>영화 제목</th>
								<td>
									<input type="text" name="name" value="${movie.name}" size="77"/>
								</td>
							</tr>
							<tr>
								<th>감독</th>
								<td>
									<input type="text" name="supervisor" value="${movie.supervisor}" size="77"/>
								</td>
							</tr>
							<tr>
								<th>출연배우</th>
								<td>
									<input type="text" name="actor" value="${movie.actor}" size="77"/>
								</td>
							</tr>
							<tr>
								<th>포스터</th>
								<td>
									<input type="file" name="pictureUrl"/><br>
									<strong>(주의사항 : 포스터를 변경하고자 할 때만 선택해주세요.)</strong>
								</td>
							</tr>
							<tr>
								<th>줄거리</th>
								<td>
									<textarea rows="10" cols="80" name="description">${movie.description}</textarea>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="수정" onclick="return movieCheck()"/>
			<input type="reset" value="다시 작성"/>
			<input type="button" value="목록" onclick="location.href='movieList.do'"/>
		</form>
	</div>
</body>
</html>