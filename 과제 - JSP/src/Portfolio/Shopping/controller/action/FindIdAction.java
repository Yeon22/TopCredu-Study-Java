package Portfolio.Shopping.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.dao.MemberDAO;
import Portfolio.Shopping.dto.MemberVO;

public class FindIdAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/findId.jsp";
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		int message = memberDAO.confirmName(name,email);
		MemberVO memberVO = memberDAO.getMemberName(name,email);
		
		request.setAttribute("message", message);
		request.setAttribute("memberVO", memberVO);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
