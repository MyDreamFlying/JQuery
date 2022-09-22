package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class MemberList
 */
@WebServlet("/MemberList.do")
public class MemberList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//private IMemberService  service ;
    
    public MemberList() {
        super();
        // TODO Auto-generated constructor stub
        //service = MemberServiceImpl.getService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//0. 한글처리 
		request.setCharacterEncoding("UTF-8");
		
		//1. 클라이언트 전송시 전달 데이타 받기 
		
		//2. service객체 얻기
		IMemberService service = MemberServiceImpl.getService();
		
		//3.service메소드호출 - 결과값 받기 
		List<MemberVO>  list = service.selectAll();
		
		//4.request에 결과값을 저장 
		request.setAttribute("sdfrxfsfqeds", list);
		
		// 결과값을 출력 - view페이지 이동  - forword
		RequestDispatcher   disp = 
				request.getRequestDispatcher("0727mvc/memberList.jsp");
		
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
