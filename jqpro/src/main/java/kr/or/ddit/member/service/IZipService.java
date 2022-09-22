package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.vo.ZipVO;

public interface IZipService {
        public List<ZipVO>  selectByDong(String dong) ;
}
