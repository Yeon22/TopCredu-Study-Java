package Portfolio.Shopping.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.controller.action.Action;
import Portfolio.Shopping.dao.ProductDAO;
import Portfolio.Shopping.dto.ProductVO;

public class AdminProductUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/product/productUpdate.jsp";
		String pseq = request.getParameter("pseq").trim();
		
		ProductDAO productDAO = ProductDAO.getInstance();
		ProductVO productVO = productDAO.getProduct(pseq);
		
		request.setAttribute("productVO", productVO);
		
		String tpage ="1";
		if(request.getParameter("tpage") != null) {
			tpage = request.getParameter("tpage");
		}
		request.setAttribute("tpage", tpage);
		
		String kindList[] = {"Hood Teeshirts", "Hoody", "Cap", "Jeans", "Backpack"};
		request.setAttribute("kindList", kindList);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
