<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_menu.html" %>

<article>
	<h1>상품(Item)</h1>
	<div id="itemdetail">
		<form method="post" name="formm">
			<fieldset>
				<legend>상품 상세 정보(Item detail Info)</legend>
				<a href="ShoppingServlet?command=product_detail&pseq=${productVO.pseq}">
					<span style="float: left;">
						<img src="product_images/${productVO.image}"/>
					</span>
					<h2>${productVO.name}</h2>
				</a>
				<label style="width: 70px; font-weight: bold; font-size: 1.24em;">가 격 : </label>
				<p style="font-weight: bold; padding-top: 6px;">${productVO.price2} 원</p>
				<label style="width: 70px; font-weight: bold; font-size: 1.24em;">수 량 : </label>
				<input type="number" name="quantity" value="1" 
					style="width: 55px; height: 18px; text-align: center; font-size: 1.25em; font-weight: bold"/><br>
				<label style="line-height: 25px; padding: 15px 0 0 5px; font-weight: bold; font-size: 1.41em;">
					${productVO.content}
				</label>
				<input type="hidden" name="pseq" value="${productVO.pseq}"/><br>
			</fieldset>
			<div class="clear"></div>
			<div id="buttons">
				<input type="button" value="장바구니에 담기" class="submit" onclick="go_cart()"/>
				<input type="button" value="즉시 구매" class="submit" onclick="go_order()"/>
				<input type="reset" value="취소" class="cancel"/>
			</div>
		</form>
	</div>
</article>

<%@ include file="../footer.jsp" %>