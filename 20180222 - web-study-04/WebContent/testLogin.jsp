<%@ page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = "htest1233";
	String pwd = "1233";
	String name = "홍길동";
	request.setCharacterEncoding("UTF-8");
	
	if(id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))){
		//리다이렉트
		response.sendRedirect("main.jsp?name="+URLEncoder.encode(name,"UTF-8"));
		//포워드방식
		//dispatcher.forward(request,response);
		//request.setAttribute("age", 20);
		//request.getAttribute("age");
	}else{
		response.sendRedirect("loginForm.jsp");
	}
%>