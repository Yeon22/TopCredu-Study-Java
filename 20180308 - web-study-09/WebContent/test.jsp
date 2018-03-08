<%@ page import="java.sql.Connection" %>
<%@ page import="com.saeyan.dao.MemberDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberDAO memDao = MemberDAO.getInstance();
		Connection conn = memDao.getConnection();
		out.println("DBCP 연동 성공");
	%>
</body>
</html>