package Project_20180222;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_20180222")
public class Servlet_20180222 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		float div = (float)num1 / (float)num2;
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("첫번째 숫자 : <b>" + num1 + "</b><br>");
		out.println("두번째 숫자 : <b>" + num2 + "</b><br><hr>");
		out.println("더한 값 : <b>");
		out.println(add);
		out.println("</b><br> 뺀 값 : <b>");
		out.println(sub);
		out.println("</b><br> 곱한 값 : <b>");
		out.println(mul);
		out.println("</b><br> 나눈 값 : <b>");
		out.println(div);
		out.println("</b><br><br><a href='javascript:history.go(-1)'>이전으로 돌아가기</a>");
		out.print("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
