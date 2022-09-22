package kr.or.ddit.zip.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.sqlMapClientFactory;
import kr.or.ddit.zip.vo.zipVO;

public class IZipDaoImpl implements IZipDao {

	//smc객체 선언
	private SqlMapClient smc;
	
	//singleton
	private static IZipDao dao;
	//Constructor
	private IZipDaoImpl() {
		smc = sqlMapClientFactory.getSqlMapClient();
	}
	
	public static IZipDao getDaoInstance() {
		if(dao==null)dao = new IZipDaoImpl();
		
		return dao;
	}
	
	
	@Override
	public List<zipVO> selectDong(String dongname) {
		List<zipVO> list = null;
		
		try {
			list = smc.queryForList("zipPro.selectDong",dongname);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
