package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/member/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/member/login.jsp";
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser") != null) { //이미 로그인된 사용자이면
			url = "/member/main.jsp"; //메인 페이지로 이동한다.
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/member/login.jsp";
		
		//아이디 받음
		String userid = request.getParameter("userid");
		//패스워드 받음
		String pwd = request.getParameter("pwd");
		
		//DB 연결 객체를 가져와서
		MemberDAO mDao = MemberDAO.getInstance();
		//DB user 있냐 없냐 체크함수
		int result = mDao.userCheck(userid,pwd);
		
		if(result == 1) {
			//DB에서 회원정보를 조회하고 빈으로 데이터를 객체로 받는다.
			MemberVO mVo = mDao.getMember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVo);
			url="/member/main.jsp";
		}else if(result == 0) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
		}else if(result == -1) {
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
