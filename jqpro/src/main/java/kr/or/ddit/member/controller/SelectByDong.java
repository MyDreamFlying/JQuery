package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IZipService;
import kr.or.ddit.member.service.ZipServiceImpl;
import kr.or.ddit.member.vo.ZipVO;

/**
 * Servlet implementation class SelectByDong
 */
@WebServlet("/SelectByDong.do")
public class SelectByDong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectByDong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//클라이언트 전송 전달 데이타 받기 
		String paramDong = request.getParameter("dong");
		
		//service객체 얻기 
		IZipService  service = ZipServiceImpl.getService();
		
		//service메소드 호출 
		List<ZipVO>  list = service.selectByDong(paramDong);
		
		request.setAttribute("sdjfs", list);
		
		request.getRequestDispatcher("0804join/selectDong.jsp").forward(request, response);
		
		
	}

}













