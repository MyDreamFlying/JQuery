package kr.or.ddit.prod.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.ProdVO;

/**
 * Servlet implementation class ProdInfo
 */
@WebServlet("/ProdInfo.do")
public class ProdInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//1. 클라이언트 전송시 전달 데이타 가져오기 - id
		String  paraId = request.getParameter("id");
		System.out.println("id=" + paraId) ;
		
		//2. service객체 얻어오기 
		IProdService  service = ProdServiceImpl.getService();
		
		//3. service메소드 호출하기- 결과값 가져오기 
		  ProdVO  vo = service.selectById(paraId);
		
		//4. 결과값을 request에 저장하기 
		  request.setAttribute("sdfsldf", vo);
		
		//5. view페이지로 이동- prod/prodInfo.jsp
		 // RequestDispatcher  disp = 
		//		  request.getRequestDispatcher("prod/prodInfo.jsp");
		  
		  RequestDispatcher  disp = 
				  request.getRequestDispatcher("0802ajaxprod/prodInfo.jsp");
				  
		  
		 disp.forward(request, response);
		 
	}

}

















