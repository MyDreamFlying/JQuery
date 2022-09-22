package kr.or.ddit.board.dao;

import java.util.List;

import kr.or.ddit.board.vo.ReplyVO;

public interface IReplyDao {

	//댓글 리스트
	public List<ReplyVO>  replyList(int bonum);
	
	//댓글 등록 
	public int replySave(ReplyVO  vo) ;
	
	//댓글 수정 
	
	//댓글 삭제 
}
