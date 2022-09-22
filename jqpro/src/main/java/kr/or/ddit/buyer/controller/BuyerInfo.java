package kr.or.ddit.buyer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;

/**
 * Servlet implementation class BuyerInfo
 */
@WebServlet("/BuyerInfo.do")
public class BuyerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerInfo() {
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
		IBuyerService  service = BuyerServiceImpl.getService();
		
		
		//service메소드 호출 하기 - 결과값 받기 
		BuyerVO  vo = service.selectByIdInfo(paramId);
		
		//request.저장 
		request.setAttribute("sdfsdfdswe", vo);
		
		
		//view페이지로 forward
		request.getRequestDispatcher("0803buyer/buyerInfo.jsp").forward(request, response);
		
	}

}



























