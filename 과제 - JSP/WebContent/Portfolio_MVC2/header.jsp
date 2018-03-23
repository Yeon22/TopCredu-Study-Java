<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company List</title>
<link href="css/jobstyle.css" rel="stylesheet">
<script type="text/javascript" src="member/member.js"></script>
<script type="text/javascript" src="mypage/mypage.js"></script>
</head>
<body>
	<div id="wrap">
		<header>
			<div id="logo">
				<a href="CompanyServlet?command=index">
					<img src="images/logo.gif" width="180" height="100" alt="companylist"/>
				</a>
			</div>
			<nav id="category_menu">
				<ul>
					<c:choose>
						<c:when test="${empty sessionScope.loginUser}">
							<li>
								<a href="CompanyServlet?command=login_form" style="width:110px;">LOGIN</a>
							</li><li>/</li>
							<li><a href="CompanyServlet?command=contract">JOIN</a></li>
						</c:when>
						<c:otherwise>
							<li style="color:orage;">
								${sessionScope.loginUser.name}(${sessionScope.loginUser.id})님
							</li>
							<li><a href="CompanyServlet?command=logout">LOGOUT</a></li>
						</c:otherwise>
					</c:choose>
					<li>/</li>
					<li>
						<a href="CompanyServlet?command=mypage">MY PAGE</a>
					</li><li>/</li>
					<li>
						<a href="CompanyServlet?command=qna_list">Q&amp;A</a>
					</li>
				</ul>
			</nav>
			<div class="clear"></div>
		</header>