<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forTokens var="city" items="서울.인천,대구.부산" delims=",">
		${city}<br>
	</c:forTokens>
	<c:forTokens var="city" items="서울.인천,대구.부산" delims=",.">
		${city}<br>
	</c:forTokens>
</body>
</html>