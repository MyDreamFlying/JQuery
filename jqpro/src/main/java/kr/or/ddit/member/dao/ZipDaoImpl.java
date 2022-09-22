package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.ZipVO;

public class ZipDaoImpl implements IZipDao {
   private SqlMapClient  client;
   
   private static IZipDao  dao;
   
   private ZipDaoImpl() {
	   client = SqlMapClientFactory.getSqlMapClient();
   }
	
   public static IZipDao  getDao() {
	   if(dao == null)  dao = new ZipDaoImpl();
	   
	   return dao;
   }
	
	@Override
	public List<ZipVO> selectByDong(String dong) {
		List<ZipVO>  list = null;
		
		try {
			list = client.queryForList("zip.selectByDong", dong);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
