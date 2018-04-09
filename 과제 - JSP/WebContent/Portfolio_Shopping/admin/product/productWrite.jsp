<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Portfolio_Shopping/admin/header.jsp" %>
<%@ include file="/Portfolio_Shopping/admin/sub_menu.jsp" %>

<article>
	<h1>상품등록(Product Entry)</h1>
	<form name="frm" method="post" enctype="multipart/form-data">
		<table id="list">
			<tr>
				<th>상품분류</th>
				<td colspan="5">
					<select name="kind">
						<c:forEach items="${kindList}" var="kind" varStatus="status">
							<option value="${status.count}">${kind}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<th>상품명</th>
				<td width="343" colspan="5">
					<input type="text" name="name" size="47" maxlength="100" value="sample"/>
				</td>
			</tr>
			<tr>
				<th>원가[A]</th>
				<td width="70">
					<input type="text" name="price1" size="11" onKeyUp='NumFormat(this)' value="1000"/>
				</td>
				<th>판매가[B]</th>
				<td width="70">
					<input type="text" name="price2" size="11" onBlur="go_ab()" onKeyUp='NumFormat(this)' value="3000"/>
				</td>
				<th>이익[B-A]</th>
				<td width="72">
					<input type="text" name="price3" size="11" readonly onKeyUp='NumFormat(this)'/>
				</td>
			</tr>
			<tr>
				<th>상세설명</th>
				<td colspan="5">
					<textarea name="content" rows="8" cols="70">상품에 대한 상세 설명을 적어주세요.</textarea>
				</td>
			</tr>
			<tr>
				<th>상품이미지</th>
				<td width="343" colspan="5">
					<input type="file" name="image"/>
				</td>
			</tr>
		</table>
		<input type="button" class="btn" value="등록" onclick="go_save()"/>
		<input type="button" class="btn" value="취소" onclick="go_mov()"/>
	</form>
</article>

<%@ include file="/Portfolio_Shopping/admin/footer.jsp" %>