<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
	String uid = "h5";
	String upwd = "h5";
	String sql = "select * from product order by proid";
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018-03-07 jdbc 과제 2</title>
</head>
<body>
	<table width="100%" border="1">
		<tr>
			<th>상품아이디</th>
			<th>상품이름</th>
			<th>가격</th>
		</tr>
		<%
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,uid,upwd);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()){
					out.println("<tr>");
					out.println("<td>" + rs.getString("proid") + "</td>");
					out.println("<td>" + rs.getString("proname") + "</td>");
					out.println("<td>" + rs.getString("price") + "</td>");
					out.println("</tr>");
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(rs != null)
						rs.close();
					if(stmt != null)
						stmt.close();
					if(conn != null)
						conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		%>
	</table>
</body>
</html>