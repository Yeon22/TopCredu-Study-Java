<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Portfolio_Shopping/admin/header.jsp" %>
<%@ include file="/Portfolio_Shopping/admin/sub_menu.jsp" %>

<script type="text/javascript">
function go_search(){
	document.frm.action = "ShoppingServlet?command=admin_member_list";
	document.frm.submit();
}
</script>

<article>
	<h1>회원리스트(Member List)</h1>
	<form name="frm" method="post">
		<table style="float: right;">
			<tr>
				<td id="searchbar">
					<strong style="font-size: 1.20em">회원이름</strong>
					<input type="text" name="key" size="25" style="border: 1px solid black; height: 20px; margin-right: 5px;"/>
					<input class="btn" type="button" value="검색" onclick="go_search()"/>
				</td>
			</tr>
		</table>
		<br>
		<table id="orderList">
			<tr>
				<th>아이디(탈퇴여부)</th>
				<th>이름</th>
				<th>이메일</th>
				<th>우편번호</th>
				<th>주소</th>
				<th>전화</th>
				<th>가입일</th>
			</tr>
			<c:forEach items="${memberList}" var="memberVO">
			<tr>
				<td>${memberVO.id}
					<c:choose>
						<c:when test="${memberVO.useyn == 'y'}">
							<input type="checkbox" name="useyn" disabled="disabled"/>
						</c:when>
						<c:otherwise>
							<input type="checkbox" name="useyn" checked="checked" disabled="disabled"/>
						</c:otherwise>
					</c:choose>
				</td>
				<td>${memberVO.name}</td>
				<td>${memberVO.email}</td>
				<td>${memberVO.zipNum}</td>
				<td>${memberVO.address}</td>
				<td>${memberVO.phone}</td>
				<td><fmt:formatDate value="${memberVO.indate}"/></td>
			</tr>
			</c:forEach>
		</table>
	</form>
</article>

<%@ include file="/Portfolio_Shopping/admin/footer.jsp" %>