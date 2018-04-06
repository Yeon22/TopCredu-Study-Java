<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_menu.jsp" %>

<article>
	<h2>1:1 고객 게시판</h2>
	<h3>고객님의 질문에 대해 운영자가 1:1 답변을 드립니다.</h3>
	<form name="formm" method="post" action="ShoppingServlet?command=qna_write">
		<fieldset>
			<legend>Board Info(게시글 정보)</legend>
			<label style="font-size: 1.24em;">Title(제목)</label><input type="text" name="subject" size="63"/><br>
			<label style="font-size: 1.24em;">Content(내용)</label><textarea rows="8" cols="64" name="content" style="resize: none;"></textarea><br>
		</fieldset>
		<div class="clear"></div>
		<div id="buttons" style="float: right;">
			<input type="submit" value="글쓰기" class="submit"/>
			<input type="reset" value="취소" class="cancel"/>
			<input type="button" value="쇼핑 계속하기" class="submit" onclick="location.href='ShoppingServlet?command=index'"/>
		</div>
	</form>
</article>

<%@ include file="../footer.jsp" %>