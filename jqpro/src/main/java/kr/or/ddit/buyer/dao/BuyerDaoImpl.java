package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class BuyerDaoImpl implements IBuyerDao {
	
	//SqlMapClient객체 
	private SqlMapClient  client;
	
	//자신의 객체
	private static IBuyerDao dao;
	
	//생성자 
	private BuyerDaoImpl() {
		
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	//자신의 객체를 생성 하고 리턴 
	public static IBuyerDao getDao() {
		if(dao == null) dao = new BuyerDaoImpl();
		
		return dao;
	}
	

	@Override
	public List<BuyerVO> selectNames() {
		List<BuyerVO> list = null;
		
		
		try {
			list = client.queryForList("buyer.selectNames");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public BuyerVO selectByIdInfo(String id) {
		BuyerVO  vo = null;
		
		try {
			vo =(BuyerVO) client.queryForObject("buyer.selectByIdInfo", id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}

}
