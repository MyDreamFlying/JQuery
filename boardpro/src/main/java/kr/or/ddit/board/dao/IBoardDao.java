package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.board.vo.BoardVO;

public interface IBoardDao {
	
	// page별 list 가져오기(1page, 2page 등 각각 page)
	public List<BoardVO> selectByPage(Map<String, Object> map) throws SQLException;
	
	// data의 전체 개수 가져오기
	public int totalCount(Map<String, Object> map); 
	
	

}
