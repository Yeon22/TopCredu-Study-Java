package com.nonage.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nonage.dao.ProductDAO;
import com.nonage.dto.ProductVO;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "index.jsp";
//		데이터베이스에서 상품 정보를 가지고 오자
		ProductDAO productDAO = ProductDAO.getInstance();
		ArrayList<ProductVO> newProductList = productDAO.listNewProduct();
		ArrayList<ProductVO> bestProductList = productDAO.listBestProduct();
		
		request.setAttribute("newProductList", newProductList);
		request.setAttribute("bestProductList", bestProductList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);	
	}

}
