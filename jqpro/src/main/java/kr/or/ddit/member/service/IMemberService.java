package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberService {
    //전체리스트
	public List<MemberVO> selectAll();
	
	//아이디 검색 
	public MemberVO idSearch(String id);
	
	
	//아이디 중복검사 
	public String checkById(String id);
	
	//가입하기 - 저장하기 
	public String insertMember(MemberVO  vo);
	
}










