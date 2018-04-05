<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_menu.html" %>

<title>아이디/비밀번호 찾기</title>
<style type="text/css">
	body{
		font-family: Verdana;
	}
	h1{
		font-family: "Times New Roman", Times, serif;
		font-size: 45px;
		font-weight: normal;
	}
	fieldset label{
		font-size: 1.24em;
		font-weight: bold;
		margin-right: 10px;
	}
	form > hr{
		margin-bottom: 20px;
		color: purple;
	}
	input{
		width: 250px;
	}
	input[type=button]{
		width: 200px;
		font-size: 1.4em;
		font-weight: bold;
	}
	input[type=button]:hover{
		color: yellow;
		text-decoration: underline;
		font-weight: bold;
		font-size: 1.5em;
	}
</style>
<article>
	<div id="wrap">
		<h1>아이디/비밀번호 찾기</h1>
		<form method="post" name="formm" action="ShoppingServlet?command=find_id_form">
			<fieldset>
				<legend><strong>ID 찾기</strong></legend>
				<label>이름(Name)</label><input type="text" name="name1" size="12"/><br>
				<label>이메일주소(Email)</label><input type="text" name="email1" size="12"/><br>
			</fieldset>
			<input type="button" value="아이디 찾기" class="submit" onclick="FindIdCheck()"/><br><br>
			<hr>
			<fieldset>
				<legend><strong>비밀번호 찾기</strong></legend>
				<label>아이디(ID)</label><input type="text" name="id" size="12"/><br>
				<label>이름(Name)</label><input type="text" name="name2" size="12"/><br>
				<label>이메일주소(Email)</label><input type="text" name="email2" size="12"/><br>
			</fieldset>
			<div class="clear"></div>
			<input type="button" value="비밀번호 찾기" class="submit" onclick="FindPwdCheck()"/>
		</form>
	</div>
</article>

<%@ include file="../footer.jsp" %>