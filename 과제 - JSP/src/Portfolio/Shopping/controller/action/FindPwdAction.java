package Portfolio.Shopping.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.dao.MemberDAO;
import Portfolio.Shopping.dto.MemberVO;

public class FindPwdAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/findPwd.jsp";
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		int message = memberDAO.confirmIDPwd(id, name, email);
		MemberVO memberVO = memberDAO.getMemberPwd(id, name, email);
		
		request.setAttribute("message", message);
		request.setAttribute("memberVO", memberVO);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
