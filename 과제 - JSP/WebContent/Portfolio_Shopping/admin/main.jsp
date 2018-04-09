<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin(관리자) 페이지</title>
<link rel="stylesheet" href="admin/css/admin.css">
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="icon" type="image/gif" href="images/animated_favicon1.gif">
<script>
function worker_check(){
	if(document.frm.workId.value == ""){
		alert("관리자 아이디를 입력해주세요.");
		return false;
	}else if(document.frm.workPwd.value == ""){
		alert("비밀번호를 입력해주세요.");
		return false;
	}else{
		return true;
	}
}
</script>
</head>
<body>
	<div id="wrap">
		<header>
			<div id="logo">
				<a href="admin/main.jsp">
					<img src="admin/images/bar_03.JPG" style="float:left"/>
				</a>
			</div>
		</header>
		<div class="clear"></div>
		<h1 id="wrap_h1">SC 쇼핑몰 관리자용 로그인</h1>
		<article>
			<div id="loginform">
				<form name="frm" method="post" action="ShoppingServlet?command=admin_login">
					<table>
						<tr>
							<td><strong>아이디(ID)</strong></td>
							<td><input type="text" name="workerId" size="15" value="admin"/></td>
						</tr>
						<tr>
							<td><strong>비밀번호(Password)</strong></td>
							<td><input type="password" name="workerPwd" size="15" value="admin"/></td>
						</tr>
						<tr align="center">
							<td colspan="2">
								<input class="btn" type="submit" value="관리자 로그인" onclick="return worker_check()"/><br><br>
								<h3 style="color:red">${message}</h3>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</article>
	</div>
</body>
</html>