package kr.or.ddit.zip.sevrice;

import java.util.List;

import kr.or.ddit.zip.dao.IZipDao;
import kr.or.ddit.zip.dao.IZipDaoImpl;
import kr.or.ddit.zip.vo.zipVO;

public class IZipServiceImpl implements IZipService {

	private IZipDao dao;
	private static IZipService service;
	
	//Constructor
	private IZipServiceImpl() {
		dao = IZipDaoImpl.getDaoInstance();
	}
	
	public static IZipService getServiceInstance() {
		if(service==null)service = new IZipServiceImpl();
		
		return service;
	}
	
	
	@Override
	public List<zipVO> selectDong(String dongname) {
		
		return dao.selectDong(dongname);
	}

}
