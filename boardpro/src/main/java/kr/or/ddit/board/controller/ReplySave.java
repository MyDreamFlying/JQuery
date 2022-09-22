package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.IReplyService;
import kr.or.ddit.board.service.ReplyServiceImpl;
import kr.or.ddit.board.vo.ReplyVO;

/**
 * Servlet implementation class ReplySave
 */
@WebServlet("/ReplySave.do")
public class ReplySave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplySave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//한글처리 
		request.setCharacterEncoding("UTF-8");
		
		//클라이언트 에서 전송시 전달데이타 받기 
		int bonum = Integer.parseInt(request.getParameter("bonum"));
		String name = request.getParameter("name");
		String cont = request.getParameter("cont");
		
		
		ReplyVO  vo = new ReplyVO();
		vo.setBonum(bonum);
		vo.setName(name);
		vo.setCont(cont);
		
		//service객체 얻기 
		IReplyService  service = ReplyServiceImpl.getService();
		
		//service메소드 호출 하기- params: vo , return : rowcount(실행건수)
		int rnum = service.replySave(vo);
		
		
		//request에 결과 데이타 저장 
		request.setAttribute("result", rnum);
		
		//view페이지로 이동 
		request.getRequestDispatcher("board/replyResult.jsp").forward(request, response);
		
		
	}

}

















