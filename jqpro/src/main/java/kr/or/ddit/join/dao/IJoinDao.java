package kr.or.ddit.join.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.join.vo.MemVO;
import kr.or.ddit.join.vo.ZipVO;
import kr.or.ddit.member.vo.MemberVO;

public interface IJoinDao {
	
	public String checkId(String id) throws SQLException;
	public List<ZipVO> selectByDong(String dong)throws SQLException;
	public String insertMember(MemVO vo)throws SQLException;
	
}