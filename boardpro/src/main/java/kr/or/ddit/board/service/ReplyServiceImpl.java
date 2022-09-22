package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.dao.IReplyDao;
import kr.or.ddit.board.dao.ReplyDaoImpl;
import kr.or.ddit.board.vo.ReplyVO;

public class ReplyServiceImpl implements IReplyService {

	//dao객체
	private IReplyDao  dao;
	
	//자신의 객체 
	private static IReplyService  service;
	
	//생성자 
	private ReplyServiceImpl() {
		dao = ReplyDaoImpl.getDao();
	}
	
	//자신의 객체를 생성 리턴 
	public static IReplyService getService() {
		if(service == null) service = new ReplyServiceImpl();
		
		return service;
	}
	
	@Override
	public List<ReplyVO> replyList(int bonum) {
		// TODO Auto-generated method stub
		return dao.replyList(bonum);
	}

	@Override
	public int replySave(ReplyVO vo) {
		// TODO Auto-generated method stub
		return dao.replySave(vo);
	}

}
