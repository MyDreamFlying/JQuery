package kr.or.ddit.buyer.dao;

import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface IBuyerDao {

	 public List<BuyerVO>   selectNames();
	 public BuyerVO  selectByIdInfo(String id);
	    
}
