package kr.or.ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.LprodVO;

/**
 * Servlet implementation class LprodList
 */
@WebServlet("/LprodList.do")
public class LprodList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LprodList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		//1. client전송시 전달 데이타 받기 
		
		//2. service객체 얻기 
		IProdService  service = ProdServiceImpl.getService();
		
		//3. service메소드 호출 - 결과값 받기 
		List<LprodVO>  list = service.selectLprod();
		
 		//4. 결과값을 request에 저장 
		request.setAttribute("sdkfjsd", list);
		
		//5. view페이지로 이동 - prod/lprodList.jsp 
	    //RequestDispatcher  disp =
		//	   request.getRequestDispatcher("prod/lprodList.jsp");
	   
		
		RequestDispatcher  disp =
			 request.getRequestDispatcher("0802ajaxprod/lprodList.jsp");
				
				
	    disp.forward(request, response);
		
	}

}




















