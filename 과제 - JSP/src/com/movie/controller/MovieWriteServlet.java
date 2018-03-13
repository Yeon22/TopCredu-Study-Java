package com.movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dto.MovieVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class MovieWriteServlet
 */
@WebServlet("/movie/movieWrite.do")
public class MovieWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/movie/movieWrite.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ServletContext context = getServletContext();
		String path = context.getRealPath("movieImg");
		String encType = "UTF-8";
		int sizeLimit = 20 * 1024 * 1024;
		MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
		
		String name = multi.getParameter("name");
		String supervisor = multi.getParameter("supervisor");
		String actor = multi.getParameter("actor");
		String pictureUrl = multi.getFilesystemName("pictureUrl");
		String description = multi.getParameter("description");
		
		MovieVO mVo = new MovieVO();
		mVo.setName(name);
		mVo.setSupervisor(supervisor);
		mVo.setActor(actor);
		mVo.setPictureUrl(pictureUrl);
		mVo.setDescription(description);
		
		MovieDAO mDao = MovieDAO.getInstance();
		mDao.insertMovie(mVo);
		response.sendRedirect("movieList.do");
	}

}
