package Portfolio.Shopping.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.dao.ProductDAO;
import Portfolio.Shopping.dto.ProductVO;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "index.jsp";
		
		ProductDAO productDAO = ProductDAO.getInstance();
		ArrayList<ProductVO> newProductList = productDAO.listNewProduct();
		ArrayList<ProductVO> bestProductList = productDAO.listBestProduct();
		
		request.setAttribute("newProductList", newProductList);
		request.setAttribute("bestProductList", bestProductList);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
