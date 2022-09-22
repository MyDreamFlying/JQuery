package kr.or.ddit.zip.dao;

import java.util.List;

import kr.or.ddit.zip.vo.zipVO;

public interface IZipDao {

	/**
	 * 검색할 동 이름을 parameter로 받아서 검색한 결과를 List에 담아서 반환하는 메서드
	 * @param dongname 검색할 동 이름
	 * @return zipVO객체가 저장된 List객체
	 */
	public List<zipVO> selectDong(String dongname);
	
}
