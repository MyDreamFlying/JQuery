package kr.or.ddit.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert.do")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//0. 한굴처리 
		request.setCharacterEncoding("UTF-8");
		
		
		//1.클라이ㅇ언트 전송시 데이타 받기 -vo에 저장 
		//id, name. pwd, bir, hp, mail, add2 , add2, zip
		//
		MemberVO   vo = new MemberVO();
		/*  -- 직접 코딩해서 값을 받기
		 * vo.setMem_id(request.getParameter("id"));
		 * vo.setMem_name(request.getParameter("name"));
		 * vo.setMem_pass(request.getParameter("pwd"));
		 * vo.setMem_bir(request.getParameter("bir"));
		 * vo.setMem_hp(request.getParameter("hp"));
		 * vo.setMem_mail(request.getParameter("mail"));
		 * vo.setMem_add1(request.getParameter("add1"));
		 * vo.setMem_add2(request.getParameter("add2"));
		 * vo.setMem_zip(request.getParameter("zip"));
		 */
		
		//요창페이지(html) 에서 serialize(), serializeArray() 를 이용해서값을 작성한 경우  
		vo.setMem_id(request.getParameter("mem_id"));
		vo.setMem_name(request.getParameter("mem_name"));
		 vo.setMem_pass(request.getParameter("mem_pass"));
		 vo.setMem_bir(request.getParameter("mem_bir"));
		 vo.setMem_hp(request.getParameter("mem_hp"));
		 vo.setMem_mail(request.getParameter("mem_mail"));
		 vo.setMem_add1(request.getParameter("mem_add1"));
		 vo.setMem_add2(request.getParameter("mem_add2"));
		 vo.setMem_zip(request.getParameter("mem_zip"));
		
		
		//service객체 얻기 
		IMemberService  service = MemberServiceImpl.getService();
		
		//service메소드 호출 - 결과값 String 
		String memId = service.insertMember(vo);
		
		//request에 저장
		request.setAttribute("sdfjskdf", memId);
		
		//view페이지로 이동 
		request.getRequestDispatcher("0804join/insert.jsp").forward(request, response);
		
		
		
	}

}













