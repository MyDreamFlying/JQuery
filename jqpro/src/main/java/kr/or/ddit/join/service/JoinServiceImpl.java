package kr.or.ddit.join.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.join.dao.IJoinDao;
import kr.or.ddit.join.dao.JoinDaoImpl;
import kr.or.ddit.join.vo.MemVO;
import kr.or.ddit.join.vo.ZipVO;


public class JoinServiceImpl implements IJoinService{
	
	private IJoinDao dao;
	private static IJoinService service;
	
	private JoinServiceImpl() {
		dao = JoinDaoImpl.getJoinDao();
	}
	
	public static IJoinService getJoinService(){
		
		if(service==null) service = new JoinServiceImpl(); 
		
		return service;
	}
	
	@Override
	public String checkId(String id) {
		String st = null;
		try {
			st = dao.checkId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	@Override
	public List<ZipVO> selectByDong(String dong) {
		List<ZipVO> list = null;
		try {
			list = dao.selectByDong(dong);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String insertMember(MemVO vo) {
		String st2 = null;
		try {
			st2 = dao.insertMember(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return st2;
	}

}