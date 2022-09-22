package kr.or.ddit.board.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.PageVO;

public interface IBoardService {
	
	//page별 리스트 가져오기 
	public List<BoardVO>  selectByPage(Map<String, Object>  map);
	
	//데이타의 전체갯수 가져오기 
	public int totalCount(Map<String, Object> map);
	
	//전체 페이지 수 구하기 
	public int totalPage(String stype, String sword);
	
	
	//페이지정보를 얻기위한 메소드 
	public PageVO  pageInfo(int page, String stype, String sword);
}












