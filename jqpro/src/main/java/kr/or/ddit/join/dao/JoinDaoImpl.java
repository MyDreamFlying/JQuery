package kr.or.ddit.join.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.join.vo.MemVO;
import kr.or.ddit.join.vo.ZipVO;



public class JoinDaoImpl implements IJoinDao{
	private SqlMapClient smc;
	
	private static JoinDaoImpl dao;
	
	private JoinDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	public static IJoinDao getJoinDao(){
		if(dao==null) dao = new JoinDaoImpl(); // 인터페이스로받은 클래스로받든 객체 생성은 클래스로
		
		return dao;
	}
	@Override
	public String checkId(String id) throws SQLException {
//		String memId =  null;
//		memId = (String)smc.queryForObject("join.checkId", id);
//		return memId;
		System.out.println(id);
		return (String)smc.queryForObject("join.checkId", id);
	}
	@Override
	public List<ZipVO> selectByDong(String dong) throws SQLException {
		// TODO Auto-generated method stub
		List<ZipVO> list = smc.queryForList("join.selectByDong", dong);
		return list;
				
	}
	@Override
	public String insertMember(MemVO vo) throws SQLException {
		String memId = (String)smc.insert("join.insertMember", vo);
		return memId;
	}
	
	
	

}