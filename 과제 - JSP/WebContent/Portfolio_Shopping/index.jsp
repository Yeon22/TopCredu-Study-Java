<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../Portfolio_Shopping/header.jsp" %>

<div class="clear"></div>

<div id="front">
	<h2>신상품(New Item)</h2>
	<div id="bestProduct">
		<c:forEach items="${newProductList}" var="productVO">
			<div id="item">
				<a href="ShoppingServlet?command=product_detail&pseq=${productVO.pseq}">
					<img src="product_images/${productVO.image}"/>
					<h3>${productVO.name}</h3>
					<p>${productVO.price2}</p>
				</a>
			</div>
		</c:forEach>
	</div>
	<div class="clear"></div>
	
	<h2>인기상품(Best Item)</h2>
	<div id="bestProduct">
		<c:forEach items="${bestProductList}" var="productVO">
			<div id="item">
				<a href="ShoppingServlet?command=product_detail&pseq=${productVO.pseq}">
					<img src="product_images/${productVO.image}"/>
					<h3>${productVO.name}</h3>
					<p>${productVO.price2}</p>
				</a>
			</div>
		</c:forEach>
	</div>
	<div class="clear"></div>
</div>

<%@ include file="../Portfolio_Shopping/footer.jsp" %>