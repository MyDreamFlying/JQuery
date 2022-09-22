package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.board.vo.ReplyVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class ReplyDaoImpl implements IReplyDao {

	//sqlMapclient
	private SqlMapClient  client ;
	
	//자신의 객체 
	private static IReplyDao  dao;
	
	//생성자 
	private ReplyDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	//자신의 객첼ㄹㄹ 생성하고 리턴 
	public static  IReplyDao getDao() {
		if( dao == null)  dao = new ReplyDaoImpl();
		return dao;
	}
	
	
	@Override
	public List<ReplyVO> replyList(int bonum) {
		List<ReplyVO>  list = null;
		
		try {
			list = client.queryForList("reply.replyList", bonum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int replySave(ReplyVO vo) {
		int  rnum = 0;   //실행된 건수
		
		try {
			rnum = (int) client.update("reply.replySave", vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rnum;
	}

}



