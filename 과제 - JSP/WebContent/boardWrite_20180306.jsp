<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="board" class="com.mission.javabeans.BoardBean_20180306"></jsp:useBean>
<jsp:setProperty name="board" property="*" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-06 JSP 과제</title>
</head>
<body>
	<h2>입력 완료된 정보</h2>
	<table>
		<tr>
			<td>작성자</td>
			<td><jsp:getProperty name="board" property="name"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><jsp:getProperty name="board" property="pass"/></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><jsp:getProperty name="board" property="email"/></td>
		</tr>
		<tr>
			<td>글 제목</td>
			<td><jsp:getProperty name="board" property="title"/></td>
		</tr>
		<tr>
			<td>글 내용</td>
			<td><jsp:getProperty name="board" property="content"/></td>
		</tr>
	</table>
</body>
</html>