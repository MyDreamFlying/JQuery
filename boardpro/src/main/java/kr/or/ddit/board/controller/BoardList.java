package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.PageVO;

/**
 * Servlet implementation class BoardList
 */
@WebServlet("/BoardList.do")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		//한글 처리 
		request.setCharacterEncoding("UTF-8");
		
		//클라이언트 전송시 전달 데이타 받기  - page, stype, sword
		int cpage = Integer.parseInt(request.getParameter("page"));
		//처음 실행시 깂이 존재 하지 않는다
		String stype = request.getParameter("stype");
		String sword = request.getParameter("sword");
		
		
		//service객체 얻기 
		 IBoardService  service = BoardServiceImpl.getService();
		 
		
		//서비스메소드 호출 -
		//param :page, stype, sword
		//결과값 : PageVO  - start, end , startPage, endPage , totalPage
		PageVO  vo = service.pageInfo(cpage, stype, sword);
		
		
		// map객체 설정- stype, sword, start, end) 
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("stype", stype);
		map.put("sword", sword);
		map.put("start", vo.getStart());
		map.put("end", vo.getEnd());
		
		//service메소드 호출-map파라미터  - 결과값 받기 
		//List가져오기 
		List<BoardVO>  list = service.selectByPage(map);
		
		
		//request에 결과값 저장 
		request.setAttribute("list", list);
		request.setAttribute("pvo", vo);
		//view페이지로 이동 
		request.getRequestDispatcher("board/list.jsp").forward(request, response);
		
		//Gson   gson = new Gson();
		//String   slist = gson.toJson(list);
		  
		
		
		
	}
	
	
	

}






















