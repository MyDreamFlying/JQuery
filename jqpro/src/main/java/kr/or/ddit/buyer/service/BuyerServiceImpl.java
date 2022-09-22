package kr.or.ddit.buyer.service;

import java.util.List;

import kr.or.ddit.buyer.dao.BuyerDaoImpl;
import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.buyer.vo.BuyerVO;

public class BuyerServiceImpl implements IBuyerService {

	//dao객체 
	private IBuyerDao dao;
	
	//자신의 객체 
	private static IBuyerService  service;
	
	//생성자 
	private BuyerServiceImpl() {
		dao = BuyerDaoImpl.getDao();
	}
	//자신의 객체를 생성- 리턴
	public static IBuyerService  getService() {
		if(service == null) service = new BuyerServiceImpl();
		
		return service;
	}
	
	@Override
	public List<BuyerVO> selectNames() {
		// TODO Auto-generated method stub
		return dao.selectNames();
	}

	@Override
	public BuyerVO selectByIdInfo(String id) {
		// TODO Auto-generated method stub
		return dao.selectByIdInfo(id);
	}

}
