package Portfolio.Shopping.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.controller.action.Action;
import Portfolio.Shopping.dao.OrderDAO;
import Portfolio.Shopping.dto.OrderVO;

public class AdminOrderListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/order/orderList.jsp";
		
		String key = "";
		if(request.getParameter("key") != null) {
			key = request.getParameter("key");
		}
		
		OrderDAO orderDAO = OrderDAO.getInstance();
		ArrayList<OrderVO> orderList = orderDAO.listOrder(key);
		
		request.setAttribute("orderList", orderList);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
