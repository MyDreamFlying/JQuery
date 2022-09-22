package kr.or.ddit.join.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.join.service.IJoinService;
import kr.or.ddit.join.service.JoinServiceImpl;
import kr.or.ddit.join.vo.ZipVO;


@WebServlet("/ZipSearch.do")
public class ZipSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ZipSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		// 0. 클라이언트 요청시 전송데이터 받기 - jsp의 dong
				String dong = request.getParameter("dong"); 
				// 1. service객체 얻기
				IJoinService service = JoinServiceImpl.getJoinService();
				// 2. service 메서드 호출 - 결과값 받기
				// 결과값을 이용해서 json을 생성하거나 출력한다. -> jsp응답페이지로 forward시켜서 위임한다.
				List<ZipVO> list = service.selectByDong(dong);
				// 3. 결과값을 request에 저장
				request.setAttribute("listd", list);
				// 4. jsp로 forward시킨다.
				request.getRequestDispatcher("0804zip/zipcode.jsp").forward(request, response);
	}

}