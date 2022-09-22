package kr.or.ddit.join.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

@WebServlet("/Insert.do")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
							HttpServletResponse response) 
									throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, 
							HttpServletResponse response) 
									throws ServletException, IOException {
		
		// 한글처리
		request.setCharacterEncoding("UTF-8");
		
		// 클라이언트 전송시 데이터 받기 - vo에 저장
		// id, name, pwd, bir, hp, mail, add1, add2, zip
		MemberVO vo = new MemberVO();
		
		/*  직접 코딩해서 값 받기
		vo.setMem_id(request.getParameter("id"));
		vo.setMem_name(request.getParameter("name"));
		vo.setMem_pass(request.getParameter("pwd"));
		vo.setMem_bir(request.getParameter("bir"));
		vo.setMem_hp(request.getParameter("hp"));
		vo.setMem_mail(request.getParameter("mail"));
		vo.setMem_add1(request.getParameter("add1"));
		vo.setMem_add2(request.getParameter("add2"));
		vo.setMem_zip(request.getParameter("zip"));
		*/
		
		
		// service객체 얻기
		IMemberService service = MemberServiceImpl.getService();
		
		// service메소드 호출 결과값 String
		String memId = service.insertMember(vo);
		
		// request에 저장
		request.setAttribute("sdfjskdf", vo);
		
		// View Page로 이동
		request.getRequestDispatcher("0804join/insert.jsp").forward(request, response);
	}

}
