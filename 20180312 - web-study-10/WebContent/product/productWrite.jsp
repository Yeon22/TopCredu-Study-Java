<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../script/product.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>상품 등록 - 관리자 페이지</h1>
		<form action="productWrite.do" method="post" enctype="multipart/form-data" name="frm">
			<table>
				<tr>
					<th>상품명</th>
					<td><input type="text" name="name" size="80"/></td>
				</tr>
				<tr>
					<th>가 격</th>
					<td><input type="text" name="price"/>원</td>
				</tr>
				<tr>
					<th>사 진</th>
					<td>
						<input type="file" name="pictureUrl"/><br>
						(주의사항 : 이미지를 변경하고자 할때만 선택하시오)
					</td>
				</tr>
				<tr>
					<th>설 명</th>
					<td>
						<textarea rows="10" cols="80" name="description"></textarea>
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="등록" onclick="return productCheck()"/>
			<input type="reset" value="다시작성"/>
			<input type="button" value="목록" onclick="location.href='productList.do'"/>
		</form>
	</div>
</body>
</html>