<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SC쇼핑몰</title>
<link href="css/style.css" rel="stylesheet">
<script type="text/javascript" src="member/member.js"></script>
<script type="text/javascript" src="product/product.js"></script>
<script type="text/javascript" src="mypage/mypage.js"></script>
</head>
<body>
	<div id="wrap">
		<header>
			<div id="logo">
				<a href="ShoppingServlet?command=index">
					<img src="images/logo.JPG" width="180" height="100" alt="scshop"/>
				</a>
			</div>
			<nav id="category_menu">
				<ul>
					<c:choose>
						<c:when test="${empty sessionScope.loginUser}">
							<li>
								<a href="ShoppingServlet?command=login_form" style="width: 50px;">LOGIN</a>
								<a href="ShoppingServlet?command=admin_login_form" style="width: 100px;">ADMIN</a>
							</li><li>/</li>
							<li><a href="ShoppingServlet?command=contract">JOIN</a></li>
						</c:when>
						<c:otherwise>
							<li style="color: orange;">${sessionScope.loginUser.name}(${sessionScope.loginUser.id})</li>
							<li><a href="ShoppingServlet?command=logout">LOGOUT</a></li>
						</c:otherwise>
					</c:choose>
					<li>/</li>
					<li><a href="ShoppingServlet?command=cart_list">CART</a></li>
					<li>/</li>
					<li><a href="ShoppingServlet?command=mypage">MY PAGE</a></li>
					<li>/</li>
					<li><a href="ShoppingServlet?command=qna_list">Q&amp;A(1:1)</a></li>
				</ul>
			</nav>
			<nav id="top_menu">
				<ul>
					<li><a href="ShoppingServlet?command=category&kind=1">Hood Teeshirts(후드티)</a></li>
					<li><a href="ShoppingServlet?command=category&kind=2">Hoody(후드집업)</a></li>
					<li><a href="ShoppingServlet?command=category&kind=3">Cap(모자)</a></li>
					<li><a href="ShoppingServlet?command=category&kind=4">Jeans(청바지)</a></li>
					<li><a href="ShoppingServlet?command=category&kind=5">Backpack(가방)</a></li>
				</ul>
			</nav>
			<div class="clear"></div>
			<hr>
		</header>