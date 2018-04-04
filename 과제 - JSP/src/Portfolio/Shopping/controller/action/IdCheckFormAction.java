package Portfolio.Shopping.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.dao.MemberDAO;

public class IdCheckFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/idcheck.jsp";
		String id = request.getParameter("id").trim();
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		int message = memberDAO.confirmID(id);
		
		request.setAttribute("message", message);
		request.setAttribute("id", id);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
