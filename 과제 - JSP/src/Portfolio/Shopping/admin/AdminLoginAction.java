package Portfolio.Shopping.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Portfolio.Shopping.controller.action.Action;
import Portfolio.Shopping.dao.WorkerDAO;

public class AdminLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "ShoppingServlet?command=admin_login_form";
		String msg = "";
		String workerId = request.getParameter("workerId").trim();
		String workerPwd = request.getParameter("workerPwd").trim();
		
		WorkerDAO workerDAO = WorkerDAO.getInstance();
		int result = workerDAO.workerCheck(workerId, workerPwd);
		
		if(result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("workerId", workerId);
			url = "ShoppingServlet?command=admin_product_list";
		} else if(result == 0) {
			msg = "비밀번호가 틀렸습니다.";
		} else if(result == -1) {
			msg = "아이디가 틀렸습니다.";
		}
		
		request.setAttribute("message", msg);
		request.getRequestDispatcher(url).forward(request, response);
	}

}
