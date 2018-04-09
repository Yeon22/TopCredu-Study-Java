<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Portfolio_Shopping/admin/header.jsp" %>
<%@ include file="/Portfolio_Shopping/admin/sub_menu.jsp" %>

<article>
	<h1>상품 상세 보기(Product Detail)</h1>
	<form name="frm" method="post">
		<table id="list">
			<tr>
				<th>상품분류</th>
				<td colspan="5" style="color: blue; font-weight: bold;">${kind}</td>
			</tr>
			<tr>
				<th align="center">상품명</th>
				<td colspan="5" style="font-weight: bold;">${productVO.name}</td>
			</tr>
			<tr>
				<th>원가[A]</th>
				<td width="60" style="font-weight: bold;"><fmt:formatNumber value="${productVO.price1}" type="currency"/></td>
				<th>판매가[B]</th>
				<td width="60" style="font-weight: bold;"><fmt:formatNumber value="${productVO.price2}" type="currency"/></td>
				<th>이익[B-A]</th>
				<td style="font-weight: bold;"><fmt:formatNumber value="${productVO.price3}" type="currency"/></td>
			</tr>
			<tr>
				<th>상세설명</th>
				<td colspan="5" style="font-size: 1.24em;">${productVO.content}</td>
			</tr>
			<tr>
				<th>상품이미지</th>
				<td colspan="5" align="center">
					<img src="product_images/${productVO.image}" width="200px"/>
				</td>
			</tr>
		</table>
		<input type="button" class="btn" value="수정" onclick="go_mod('${tpage}','${productVO.pseq}')"/>
		<input type="button" class="btn" value="목록" onclick="go_list('${tpage}')"/>
	</form>
</article>

<%@ include file="/Portfolio_Shopping/admin/footer.jsp" %>