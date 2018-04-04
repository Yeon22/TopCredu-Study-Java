<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디 중복 체크</title>
<style type="text/css">
	body{
		background-color: white;
		font-family: Verdana;
	}
	#wrap{
		margin: 10px 20px;
	}
	h1{
		font-family: "Times New Roman", Times, serif;
		font-size: 45px;
		color: black;
		font-weight: normal;
		margin: 20px 10px 15px 10px;
	}
	hr{
		margin: 0 0 30px 0;
	}
	label{
		margin-right: 5px;
		font-weight: bold;
	}
	input[type=text]{
		margin-top: 5px;
		width: 220px;
		height: 20px;
		border: 1px solid black;
		text-align: center;
	}
	input[type=button], input[type=submit]{
		float: right;
		width: 70px;
		height: 32px;
		font-weight: bold;
		font-size: 1.24em;
		border: 1px solid black;
		background-color: white;
	}
	input[type=button]:hover, input[type=submit]:hover{
		background-color: black;
		color: yellow;
		cursor: pointer;
	}
</style>
<script type="text/javascript">
	function idok(){
		opener.formm.id.value = "${id}";
		opener.formm.reid.value = "${id}";
		self.close();
	}
</script>
</head>
<body>
	<div id="wrap">
		<h1>ID 중복 확인</h1>
		<hr>
		<form method="post" name="formm" style="margin-right: 0;" action="ShoppingServlet?command=id_check_form">
			<label>아이디(User ID)</label><input type="text" name="id" value=""/>
			<input type="submit" value="검색" class="submit" onclick="idcheck()"/><br>
			<div style="margin-top: 20px;">
				<c:if test="${message == 1}">
					<script type="text/javascript">opener.document.formm.id.value="";</script>
					<strong>${id}</strong>는 이미 사용 중인 아이디입니다.
				</c:if>
				<c:if test="${message == -1}">
					<c:if test="${empty id}">
						<script type="text/javascript">
							alert("검색할 아이디를 입력하여 주세요.");
							document.form.id.focus();
						</script>
						<strong>검색할 아이디를 입력해주세요.</strong><input type="button" value="사용" class="cancel" onclick="idok()"/>
					</c:if>
					<c:if test="${!empty id}">
						<strong>${id}</strong>는 사용 가능한 ID입니다.<input type="button" value="사용" class="cancel" onclick="idok()"/>
					</c:if>
				</c:if>
			</div>
		</form>
	</div>
</body>
</html>