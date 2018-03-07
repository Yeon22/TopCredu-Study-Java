<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="item" class="com.mission.javabeans.ItemBean_20180306"></jsp:useBean>
<jsp:setProperty name="item" property="*"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-06 JSP 과제</title>
</head>
<body>
	<h2>등록한 과일</h2><hr>
	<table>
		<tr>
			<td>과일 이름 : </td>
			<td><jsp:getProperty name="item" property="name"/></td>
		</tr>
		<tr>
			<td>과일 가격 : </td>
			<td><jsp:getProperty name="item" property="price"/></td>
		</tr>
		<tr>
			<td>과일 설명 : </td>
			<td><jsp:getProperty name="item" property="description"/></td>
		</tr>
	</table>
</body>
</html>