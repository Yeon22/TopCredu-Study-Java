<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! int global_cnt = 0; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int local_cnt = 0;
		out.print("<br> local_cnt : ");
		out.print(++local_cnt);
		out.print("<br> global_cnt : ");
		out.print(++global_cnt);
	%>
</body>
</html>