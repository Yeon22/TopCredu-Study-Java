<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Portfolio_Shopping/admin/header.jsp" %>
<%@ include file="/Portfolio_Shopping/admin/sub_menu.jsp" %>

<script type="text/javascript">
function go_view(qseq){
	var theForm = document.frm;
	theForm.qseq.value = qseq;
	theForm.action = "ShoppingServlet?command=admin_qna_detail";
	theForm.submit();
}
</script>

<article>
	<h1>Q&amp;A 게시글 리스트(Q&amp;A List)</h1>
	<form name="frm" method="post">
		<input type="hidden" name="qseq"/>
		<table id="productList">
			<tr>
				<th>번호(답변여부)</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<c:forEach items="${qnaList}" var="qnaVO">
			<tr>
				<td>${qnaVO.qseq}
					<c:choose>
						<c:when test="${qnaVO.rep == '1'}">(미처리)</c:when>
						<c:otherwise>(답변처리완료)</c:otherwise>
					</c:choose>
				</td>
				<td>
					<a href="#" onclick="go_view('${qnaVO.qseq}')">${qnaVO.subject}</a>
				</td>
				<td>${qnaVO.id}</td>
				<td><fmt:formatDate value="${qnaVO.indate}"/></td>
			</tr>
			</c:forEach>
		</table>
	</form>
</article>

<%@ include file="/Portfolio_Shopping/admin/footer.jsp" %>