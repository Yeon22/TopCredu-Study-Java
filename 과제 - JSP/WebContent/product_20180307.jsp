<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	String url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
	String uid = "h5";
	String pass = "h5";
	String sql = "insert into product values(?,?,?)";
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-07 jdbc 과제 2</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String proid = request.getParameter("proid");
		String proname = request.getParameter("proname");
		String price = request.getParameter("price");
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,uid,pass);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, proid);
			pstmt.setString(2, proname);
			pstmt.setInt(3, Integer.parseInt(price));
			
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	%>
	<h3>상품 등록 성공</h3>
	<a href="product_20180307_all.jsp">모든 상품 목록 보기</a>
</body>
</html>