package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.LprodVO;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements IProdDao {

	private SqlMapClient  client ;
	private static IProdDao  dao;
	
	//생성자 
	private  ProdDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	//자신의 객체 생성하고 리턴 
	public static IProdDao getDao() {
		if(dao == null)  dao = new ProdDaoImpl();
		
		return dao;
	}
	
	
	@Override
	public List<LprodVO> selectLprod() {
		List<LprodVO> list = null;
		
		try {
			list = client.queryForList("prod.selectLprod");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ProdVO> selectByLgu(String lgu) {
		List<ProdVO> list = null;
		
		try {
			list = client.queryForList("prod.selectByLgu", lgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return list;
	}
	@Override
	public ProdVO selectById(String id) {
		ProdVO  vo = null;
		
		try {
			vo = (ProdVO) client.queryForObject("prod.selectById", id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vo;
	}

}











