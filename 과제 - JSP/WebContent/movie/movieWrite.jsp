<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2013-03-13 과제</title>
<link rel="stylesheet" type="text/css" href="../movieCSS/movieStyle.css">
<script type="text/javascript" src="../movieScript/movie.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>영화 등록</h1>
		<form action="movieWrite.do" method="post" enctype="multipart/form-data" name="frm">
			<table>
				<tr>
					<th>영화 제목</th>
					<td><input type="text" name="name" size="77"/></td>
				</tr>
				<tr>
					<th>감독</th>
					<td><input type="text" name="supervisor" size="77"/></td>
				</tr>
				<tr>
					<th>출연배우</th>
					<td><input type="text" name="actor" size="77"/></td>
				</tr>
				<tr>
					<th>영화 포스터</th>
					<td>
						<input type="file" name="pictureUrl"/><br>
						<strong>(주의사항 : 영화 포스터를 등록해주세요.)</strong>
					</td>
				</tr>
				<tr>
					<th>영화 줄거리</th>
					<td>
						<textarea rows="10" cols="80" name="description"></textarea>
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="등록" onclick="return movieCheck()"/>
			<input type="reset" value="다시 작성"/>
			<input type="button" value="목록" onclick="location.href='movieList.do'"/>
		</form>
	</div>
</body>
</html>