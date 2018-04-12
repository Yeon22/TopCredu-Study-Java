package Portfolio.Shopping.admin;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Portfolio.Shopping.controller.action.Action;

public class AdminProductUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "ShoppingServlet?command=admin_product_list";
		HttpSession session = request.getSession();
		
		int sizeLimit = 5 * 1024 * 1024;
		String savePath = "Portfolio_Shopping/product_images";
		ServletContext context = session.getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		
		MultipartRequest multi = new MultipartRequest(request, uploadFilePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());
		
		
	}

}
