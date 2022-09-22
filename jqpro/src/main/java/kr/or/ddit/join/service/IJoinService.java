package kr.or.ddit.join.service;

import java.util.List;

import kr.or.ddit.join.vo.MemVO;
import kr.or.ddit.join.vo.ZipVO;
import kr.or.ddit.member.vo.MemberVO;

public interface IJoinService {
	
	public String checkId(String id);
	public List<ZipVO> selectByDong(String dong);
	public String insertMember(MemVO vo);
}