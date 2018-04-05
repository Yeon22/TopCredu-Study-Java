<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_menu.html" %>

<article>
	<h2>회원가입(Join Us)</h2>
	<form id="join" action="ShoppingServlet?command=join" method="post" name="formm">
		<fieldset>
			<legend>기본 정보(Basic Info)</legend>
			<label>아이디(User ID)</label>
			<input type="text" name="id" size="12"/>
			<input type="hidden" name="reid"/>
			<input type="button" value="중복 체크" class="dup" onclick="idcheck()"/><br>
			
			<label>비밀번호(Password)</label>
			<input type="password" name="pwd"/><br>
			
			<label>비밀번호 재입력<br>(Retype Password)</label>
			<input type="password" name="pwdCheck" style="height: 24px; margin-top: 10px;"/><br><br>
			
			<label style="margin-top: -5px;">이름(Name)</label>
			<input type="text" name="name" style="margin-top: -5px"/><br>
			
			<label>이메일(E-Mail)</label>
			<input type="text" name="email"/><br>
		</fieldset>
		<fieldset>
			<legend>옵션사항(Optional)</legend>
			<label>우편번호(Zip Code)</label>
			<input type="text" name="zipNum" size="10"/>
			<input type="button" value="주소 찾기" class="dup" onclick="post_zip()"/><br>
			
			<label>주소(Address)</label>
			<input type="text" name="addr1" size="50"/><br>
			<label></label>
			<input type="text" name="addr2" size="50"/><br>
			
			<label>전화번호<br>(Phone Number)</label>
			<input type="text" name="phone" style="margin-top: 10px;"/><br>
		</fieldset>
		<div class="clear"></div>
		<div id="buttons">
			<input type="button" value="회원가입" class="submit" onclick="go_save()"/>
			<input type="reset" value="취소" class="cancel"/>
		</div>
	</form>
</article>

<%@ include file="../footer.jsp" %>