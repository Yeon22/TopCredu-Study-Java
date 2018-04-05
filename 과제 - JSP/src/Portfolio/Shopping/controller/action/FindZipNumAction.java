package Portfolio.Shopping.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.dao.AddressDAO;
import Portfolio.Shopping.dto.AddressVO;

public class FindZipNumAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/findZipNum.jsp";
		String roGil = request.getParameter("roGil");
		if(roGil != null && roGil.trim().equals("") == false) {
			AddressDAO addressDAO = AddressDAO.getInstance();
			ArrayList<AddressVO> addressList = addressDAO.selectAddressByRoGil(roGil.trim());
			request.setAttribute("addressList", addressList);
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
