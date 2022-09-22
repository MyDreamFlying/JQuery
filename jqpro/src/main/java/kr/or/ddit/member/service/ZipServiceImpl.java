package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.dao.IZipDao;
import kr.or.ddit.member.dao.ZipDaoImpl;
import kr.or.ddit.member.vo.ZipVO;

public class ZipServiceImpl implements IZipService {

	private IZipDao  dao;
	
	private static IZipService  service;
	
	private ZipServiceImpl() {
		dao = ZipDaoImpl.getDao();
	}
	
	public static IZipService  getService() {
		if(service == null)  service = new ZipServiceImpl();
		
		return service;
	}
	
	@Override
	public List<ZipVO> selectByDong(String dong) {
		// TODO Auto-generated method stub
		return dao.selectByDong(dong);
	}

}
