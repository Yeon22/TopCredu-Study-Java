package Portfolio.Shopping.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.controller.action.Action;

public class AdminProductWriteFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/product/productWrite.jsp";
		String kindList[] = {"Hood Teeshirts", "Hoody", "Cap", "Jeans", "Backpack"};
		
		request.setAttribute("kindList", kindList);
		request.getRequestDispatcher(url).forward(request, response);
	}

}
