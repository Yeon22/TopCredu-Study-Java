<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소 찾기</title>
<style type="text/css">
	body{
		background-color: gray;
		font-family: Verdana;
	}
	#popup{
		padding: 0 10px;
	}
	#popup h1{
		font-family: "Times New Roman", Times, serif;
		font-size: 40px;
		color: white;
		font-weight: normal;
	}
	label{
		padding: 5px;
		font-size: 20px;
		color: white;
	}
	input[type=text]{
		width: 200px;
		height: 23px;
		border: 1px solid black;
	}
	input[type=submit]{
		margin-left: 20px;
		width: 70px;
		height: 30px;
		border: 1px solid black;
		font-size: 15px;
		font-weight: bold;
	}
	input[type=submit]:hover{
		background-color: black;
		color: yellow;
		font-size: 17px;
		font-weight: lighter;
	}
	table#zipcode{
		border-collapse: collapse;
		border-top: 3px solid #fff;
		border-bottom: 3px solid #fff;
		width: 100%;
		margin-top: 15px;
	}
	table#zipcode th, table#zipcode td{
		text-align: center;
		border-bottom: 1px dotted #fff;
		color: #FFF;
	}
	table th, td{
		padding: 10px;
	}
	table#zipcode a{
		display: block;
		height: 20px;
		text-decoration: none;
		color: #fff;
		padding: 10px;
	}
	table#zipcode a:hover{
		color: #F90;
		text-decoration: underline;
	}
</style>
<script type="text/javascript">
	function result(zipNum, sido, gugun, roGil){
		opener.document.formm.zipNum.value = zipNum;
		opener.document.formm.addr1.value = sido + " " + gugun + " " + roGil;
		self.close();
	};
</script>
</head>
<body>
	<div id="popup">
		<h1>우편번호검색<br>(Zip Code Search)</h1>
		<form method="post" name="formm" action="ShoppingServlet?command=find_zip_num">
			<label>도로명 : </label><input type="text" name="roGil"/><input type="submit" value="찾기" class="submit"/>
		</form>
		<table id="zipcode">
			<tr>
				<th>우편번호</th>
				<th>주소(Address)</th>
			</tr>
			<c:forEach items="${addressList}" var="addressVO">
			<tr>
				<td>${addressVO.zipNum}</td>
				<td>
					<a href="#" onclick="return result('${addressVO.zipNum}','${addressVO.sido}','${addressVO.gugun}','${addressVO.roGil}')">
						${addressVO.sido} ${addressVO.gugun} ${addressVO.roGil}
					</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>