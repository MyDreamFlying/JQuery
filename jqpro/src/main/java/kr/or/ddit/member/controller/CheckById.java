package kr.or.ddit.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;

/**
 * Servlet implementation class CheckById
 */
@WebServlet("/CheckById.do")
public class CheckById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//클라이언트 전송시 전달 데이타 받기 - id
		String paramId = request.getParameter("id");
		
		//service객체 얻기 
		IMemberService  service = MemberServiceImpl.getService();
		
		//service 메소드호출 - 결과값 받기 - string 
		String mid = service.checkById(paramId);
		
		//request.에저장 
		request.setAttribute("sdfsdkfs8732", mid);
		
		
		//view페이지로 forward
		request.getRequestDispatcher("0804join/idcheck.jsp").forward(request, response);
		
	}

}
















