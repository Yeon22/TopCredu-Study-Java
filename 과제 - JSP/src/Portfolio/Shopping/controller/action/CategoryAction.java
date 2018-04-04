package Portfolio.Shopping.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.dao.ProductDAO;
import Portfolio.Shopping.dto.ProductVO;

public class CategoryAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "product/productKind.jsp";
		String kind = request.getParameter("kind").trim();
		
		ProductDAO productDAO = ProductDAO.getInstance();
		ArrayList<ProductVO> productKindList = productDAO.listKindProduct(kind);
		
		request.setAttribute("productKindList", productKindList);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
