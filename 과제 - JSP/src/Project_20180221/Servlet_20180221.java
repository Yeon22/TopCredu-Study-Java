package Project_20180221;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_20180221
 */
@WebServlet("/Servlet_20180221")
public class Servlet_20180221 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String addr = request.getParameter("addr");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("입력된 정보입니다.<br><br>");
		out.println("아이디 : ");
		out.println(id);
		out.println("<br> 패스워드 : ");
		out.println(pw);
		out.println("<br> 이름 : ");
		out.println(name);
		out.println("<br> 나이 : ");
		out.println(age);
		out.println("<br> 주소 : ");
		out.println(addr);
		out.println("<br><br><a href='javascript:history.go(-1)'>이전</a>");
		out.print("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
