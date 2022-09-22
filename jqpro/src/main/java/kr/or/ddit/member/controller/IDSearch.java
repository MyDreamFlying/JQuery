package kr.or.ddit.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class IDSearch
 */
@WebServlet("/IDSearch.do")
public class IDSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IDSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//0. 한글처리 
		request.setCharacterEncoding("UTF-8");
		
		//1. 클라이언트 전송시 전달 데이타 받기 
		String userId = request.getParameter("id");
		
		//2. service객체 얻기
		IMemberService   service = MemberServiceImpl.getService();
		
		//3. service메소드 호출 - 결과값 받기 
		MemberVO res = service.idSearch(userId);
		
		//4. request에 결과값을 저장 
		request.setAttribute("sliwd", res);
		
		//5. view페이지 이동 
		RequestDispatcher  disp = 
				  request.
				  getRequestDispatcher("0727mvc/idByInfo.jsp");
		
		disp.forward(request, response);
	}

}













