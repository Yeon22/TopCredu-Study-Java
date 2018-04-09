<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SC ShoppingMall Admin</title>
<link rel="stylesheet" href="admin/css/admin.css"/>
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="icon" type="image/gif" href="images/animated_favicon1.gif">
<script type="text/javascript" src="admin/product/product.js"></script>
</head>
<c:choose>
	<c:when test="${empty workerId}">
		<script type="text/javascript">
			location.herf="ShoppingServlet?command=admin_login_form";
		</script>
	</c:when>
</c:choose>
<body onload="go_ab()">
	<div id="wrap">
		<header>
			<div id="logo">
				<a href="ShoppingServlet?command=admin_login_form">
					<img src="admin/images/bar_03.JPG">
				</a>
			</div>
			<input class="btn" type="button" value="logout" style="float: right;" 
				onclick="location.href='ShoppingServlet?command=admin_logout'"/>
		</header>
		<div class="clear"></div>