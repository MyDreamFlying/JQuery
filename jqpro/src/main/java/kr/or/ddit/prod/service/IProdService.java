package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.LprodVO;
import kr.or.ddit.prod.vo.ProdVO;

public interface IProdService {
	
	//Lprod List가져오기
	public List<LprodVO>  selectLprod();

	//lprod_gu를 조건으로 prod List가져오기 
	public List<ProdVO> selectByLgu(String lgu);
	
	//prod_id를 조건으로 하는 상품의 detail 가져오기 
	public ProdVO  selectById(String id);
}
