package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class BoardDaoImpl implements IBoradDao {

	//SqlMapClient 
	SqlMapClient  client ;
	
	//자신의 객체
	private static IBoradDao  dao;
	
	//생성자 
	private BoardDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	//자신의 객체를 생성 하고 리턴 
	public static IBoradDao  getDao() {
		if(dao == null)  dao = new BoardDaoImpl();
		
		return dao;
	}
	
	
	@Override
	public List<BoardVO> selectByPage(Map<String, Object> map) {
		List<BoardVO>  list = null;

		try {
			list = client.queryForList("board.selectByPage", map);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public int totalCount(Map<String, Object> map) {
		int   cnt = 0;
		
		try {
			cnt = (int)client.queryForObject("board.totalCount", map);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}

}













