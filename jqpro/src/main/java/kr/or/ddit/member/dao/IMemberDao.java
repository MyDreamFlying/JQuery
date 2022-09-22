package kr.or.ddit.member.dao;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberDao {
	
	public List<MemberVO> selectAll() throws SQLException;
	
	//아이디 검색 
	public MemberVO idSearch(String id) throws SQLException ;
	
	//아이디 중복검사 
	public String checkById(String id) throws SQLException;
	
	//가입하기 - 저장하기 
	public String insertMember(MemberVO  vo) throws SQLException;
}
