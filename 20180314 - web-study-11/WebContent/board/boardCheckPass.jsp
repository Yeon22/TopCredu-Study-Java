<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 수정 혹은 삭제할 수 있는 자격이 있는지 비밀번호 확인을 위한 비밀번호 입력 페이지</title>
<link rel="stylesheet" type="text/css" href="css/board.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>
	<div align="center">
		<h1>비밀번호 확인</h1>
		<form action="BoardServlet" name="frm" method="get">
			<input type="hidden" name="command" value="board_check_pass"/>
			<input type="hidden" name="num" value="${param.num}"/>
			<table style="width: 80%">
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass" size="20"/></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="확 인" onclick="return passCheck()"/>
			<br>
			${message}
		</form>
	</div>
</body>
</html>