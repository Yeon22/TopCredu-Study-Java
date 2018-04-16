<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Portfolio_Shopping/admin/header.jsp" %>
<%@ include file="/Portfolio_Shopping/admin/sub_menu.jsp" %>

<article>
	<h1>상품리스트(Product List)</h1>
	<form name="frm" method="post">
		<table style="float: right;">
			<tr>
				<td width="700">
					<strong style="font-size: 1.20em; margin-right: 5px;">상품명</strong> 
					<input type="text" name="key" size="25" style="border: 1px solid black; height: 20px; margin-right: 5px;"/>
					<input type="button" class="btn" name="btn_search" value="검색" onclick="go_search()"/>
					<input type="button" class="btn" name="btn_total" value="전체보기" onclick="go_total()"/>
					<input type="button" class="btn" name="btn_write" value="상품등록" onclick="go_wrt()"/>
				</td>
			</tr>
		</table>
		<table id="productList">
			<tr>
				<th>번호</th>
				<th>상품명</th>
				<th>원가</th>
				<th>판매가</th>
				<th>등록일</th>
				<th>사용유무</th>
			</tr>
			<c:choose>
				<c:when test="${productListSize <= 0}">
					<tr>
						<td width="100%" colspan="7" align="center" height="23" style="text-align: center; color: red;">
							동록된 상품이 없습니다.
						</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${productList}" var="productVO">
						<tr>
							<td height="23" align="center" style="text-align: center; padding-right: 0px; font-weight: bold;">
								${productVO.pseq}
							</td>
							<td style="text-align: center; padding-left: 0px; padding-right: 0px;">
								<a href="#" onclick="go_detail('${tpage}','${productVO.pseq}')">${productVO.name}</a>
							</td>
							<td style="text-align: center; padding-left: 0px; padding-right: 0px;">
								<fmt:formatNumber value="${productVO.price1}" type="currency"/>
							</td>
							<td style="text-align: center; padding-left: 0px; padding-right: 0px;">
								<fmt:formatNumber value="${productVO.price2}" type="currency"/>
							</td>
							<td style="text-align: center; padding-left: 0px; padding-right: 10px;">
								<fmt:formatDate value="${productVO.indate}" type="date"/>
							</td>
							<td style="padding-left: -10px;">
								<c:choose>
									<c:when test="${productVO.useyn == '1'}">미사용</c:when>
									<c:otherwise>사용</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="6" style="text-align: center;">${paging}</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</table>
	</form>
</article>

<%@ include file="/Portfolio_Shopping/admin/footer.jsp" %>