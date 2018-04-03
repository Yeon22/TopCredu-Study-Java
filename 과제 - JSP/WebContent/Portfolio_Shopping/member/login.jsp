<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_menu.html" %>

<article>
	<h1>로그인(Login)</h1>
	<form method="post" action="ShoppingServlet?command=login">
		<fieldset>
			<legend></legend>
			<label><strong>유저 ID(User ID)</strong></label><input type="text" name="id" value=""/><br>
			<label><strong>비밀번호(Password)</strong></label><input type="password" name="pwd" value=""/><br>
		</fieldset>
		<div class="clear"></div>
		<div id="buttons">
			<input type="submit" value="로그인" class="submit"/>
			<input type="button" value="회원가입" class="cancel" onclick="location='ShoppingServlet?command=join_form'"/>
			<input type="button" value="아이디, 비밀번호 찾기" class="submit" onclick="location='ShoppingServlet?command=find_id_form'"/>
		</div>
	</form>
</article>

<%@ include file="../footer.jsp" %>