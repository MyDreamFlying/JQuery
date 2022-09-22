package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.vo.BoardVO;

public interface IBoradDao {
	
	//페이지별 리ㅣ스트 가졍오기 
	public List<BoardVO>  selectByPage(Map<String, Object>  map);
	
	//데이타의 전체갯수 가져오기 
	public int totalCount(Map<String, Object> map);
	
}
