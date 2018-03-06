<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="com.bsy.javabean.MemberBean"></jsp:useBean>
	<hr>
	자바 빈 객체 생성 후 저장된 정보 출력하기 <br><br>
	이름 : <jsp:getProperty property="name" name="member"/><br>
	아이디 : <jsp:getProperty property="userid" name="member"/>
	<hr>
	정보 변경한 후 변경된 정보 출력하기 <br><br>
	<jsp:setProperty property="name" name="member" value="홍길동"/>
	<jsp:setProperty name="member" property="userid" value="gildong"/>
	
	이름 : <jsp:getProperty property="name" name="member"/><br>
	아이디 : <jsp:getProperty property="userid" name="member"/>
</body>
</html>