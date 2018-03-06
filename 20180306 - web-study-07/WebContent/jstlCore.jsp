<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="msg" value="Hello"></c:set>
	msg = ${msg}<br>
	<c:set var="age">
		30
	</c:set>
	age = ${age}<hr>
	<c:set var="member" value="<%= new com.bsy.javabeans.MemberBean() %>">
	</c:set>
	<c:set target="${member}" property="name" value="홍길동"></c:set>
	<c:set target="${member}" property="userid">gildong</c:set>
	member = ${member}<hr>
</body>
</html>