package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.dao.IProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.LprodVO;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements IProdService {

	//dao객체 
	private IProdDao  dao;
	//자신의 객체
	private static IProdService  service ;
	
	
	//생성자 
	private ProdServiceImpl() {
		dao = ProdDaoImpl.getDao();
	}
	
	//자신의 객체를 생성하고 리턴 
	public static IProdService getService() {
		if(service == null) service = new ProdServiceImpl();
		
		return service;
	}
	
	
	@Override
	public List<LprodVO> selectLprod() {
		// TODO Auto-generated method stub
		return dao.selectLprod();
	}

	@Override
	public List<ProdVO> selectByLgu(String lgu) {
		// TODO Auto-generated method stub
		return dao.selectByLgu(lgu);
		
	}

	@Override
	public ProdVO selectById(String id) {
		// TODO Auto-generated method stub
		return dao.selectById(id);
		
	}

}















