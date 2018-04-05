package Portfolio.Shopping.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.dao.MemberDAO;
import Portfolio.Shopping.dto.MemberVO;

public class FindIdPwdAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/findIdPwd.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
