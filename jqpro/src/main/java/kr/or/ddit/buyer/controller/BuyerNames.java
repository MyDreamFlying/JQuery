package kr.or.ddit.buyer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;

/**
 * Servlet implementation class BuyerNames
 */
@WebServlet("/BuyerNames.do")
public class BuyerNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerNames() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//클라이언트 전송시 전달데이타 받기 
		
		
		//service객체 얻기 
		IBuyerService   service = BuyerServiceImpl.getService();
		
		
		//service메소드 호출 - 결과값 받기 
		List<BuyerVO>  list = service.selectNames();
 		
		//결과값을 request에 저장 
		request.setAttribute("sldfkjlskjdf", list);
		
		//view 페이지로 forward
		request.getRequestDispatcher("0803buyer/buyerNames.jsp").forward(request, response);
		
		
	}

}


















