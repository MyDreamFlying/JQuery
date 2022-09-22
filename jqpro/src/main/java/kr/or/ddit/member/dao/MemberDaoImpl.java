package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;

public class MemberDaoImpl  implements IMemberDao{

	//필요한거- SqlMapClient 
	private SqlMapClient   client;
	
	//자신의 객체 
	private static IMemberDao dao;
	
	//생성자 
	private  MemberDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	//자신의 객체를 생성하고 리턴 - service에서 사용 하는 것 
	public static IMemberDao getDao() {
		if(dao == null)  dao = new  MemberDaoImpl();
		
		return dao;
	}
	
	@Override
	public List<MemberVO> selectAll() 
			throws SQLException {
		
		//List<MemberVO>  list = null;
		//list = client.queryForList("");
		//return list ;
		
		return client.queryForList("member.selectAll");
	}

	@Override
	public MemberVO idSearch(String id) throws SQLException {
		// TODO Auto-generated method stub
		
		MemberVO   memId = null;
		
		memId = (MemberVO)client.queryForObject("member.idSearch", id);
		
		return memId;
	}

	@Override
	public String checkById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (String) client.queryForObject("member.checkById", id);
		
	}

	@Override
	public String insertMember(MemberVO vo) throws SQLException {
		// TODO Auto-generated method stub
		return  (String)client.insert("member.insertMember", vo);
		
	}

}







