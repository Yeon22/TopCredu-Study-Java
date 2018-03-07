<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-06 JSP 과제</title>
<style>
	h2 {padding-left: 700px;}
	.box {border: 1px solid black; width: 570px; height: 420px; margin-left: 480px; padding: 10px; }
	label {font-weight: bold;}
	.in {width:200px; height: 50px; margin-left: 700px; margin-top: 5px; }
	#lb {background-color: silver; text-align: center;}
	#lblb {background-color: silver; text-align: center; height: 170px; padding-top: 130px;}
</style>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<form method="post" action="boardWrite_20180306.jsp">
		<div class="box">
			<table>
				<tr>
					<td><div id="lb"><label for="name">작성자</label></div></td>
					<td><input type="text" name="name" id="name" size="10"/></td>
				</tr>
				<tr>
					<td><div id="lb"><label for="pass">비밀번호</label></div></td>
					<td><input type="password" name="pass" id="pass" size="10"/>(게시물 수정 삭제시 필요합니다.)</td>
				</tr>
				<tr>
					<td><div id="lb"><label for="email">이메일</label></div></td>
					<td><input type="text" name="email" id="email" size="35"/></td>
				</tr>
				<tr>
					<td><div id="lb"><label for="title">글 제목</label></div></td>
					<td><input type="text" name="title" id="title" size="63"/></td>
				</tr>
				<tr>
					<td><div id="lblb"><label for="content">글 내용</label></div></td>
					<td><textarea rows="20" cols="65" name="content" id="content"></textarea></td>
				</tr>
			</table>
		</div>
		<div class="in">
			<input type="submit" value="등록"/> 
			<input type="reset" value="다시작성"/>
		</div>
	</form>
</body>
</html>