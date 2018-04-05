<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ID 찾기</title>
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
strong{
	color: red;
	font-size: 1.24em;
	text-decoration: underline;
}
</style>
<script type="text/javascript">
function cancel(){
	self.close();
}
</script>
</head>
<body>
	<div id="wrap">
	<h1>ID 조회 결과</h1>
	<hr>
	<form method=post name=formm style="margin-right:0">
		<div style="margin-top: 20px">
			<c:if test="${message == 1}">
				<label>고객님의 아이디는 <strong>${memberVO.id}</strong> 입니다.</label>
			</c:if>
			<c:if test="${message == -1 }">
				<label>현재 존재하지 않는 계정 입니다.</label>
				<input type="button" value="닫기" class="cancel" onclick="cancel()">
			</c:if>
		</div>    
	</form>
	</div>
</body>
</html>