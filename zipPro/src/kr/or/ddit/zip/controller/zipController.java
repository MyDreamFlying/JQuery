package kr.or.ddit.zip.controller;

import java.util.List;
import java.util.Scanner;

import kr.or.ddit.zip.sevrice.IZipService;
import kr.or.ddit.zip.sevrice.IZipServiceImpl;
import kr.or.ddit.zip.vo.zipVO;

public class zipController {
		//service 객체 선언
		private IZipService service;
		private static Scanner scan;
		
		//generator
		public zipController() {
			service = IZipServiceImpl.getServiceInstance();
			scan = new Scanner(System.in);
		}

		public void selectDong(String dongname) {
			System.out.println();
			System.out.println("검색할 동 이름을 입력하세요");
			System.out.print("동 이름 >>");
			dongname = scan.next();
			
			List<zipVO>list = service.selectDong(dongname);
			
			for(zipVO vo :  list) {

				String zipcode = vo.getZipcode();
				String sido = vo.getSido();
				String gugun = vo.getGugun();
				String dong = vo.getDong();
				String ri = vo.getRi();
				String bldg = vo.getBldg();
				String bunji = vo.getBunji();
				int seq = vo.getSeq();
				
				System.out.println(zipcode +"\t\t"+ sido +"\t\t"+ gugun +"\t\t"+ dong
						+"\t\t"+ ri +"\t\t"+ bldg +"\t\t"+ bunji +"\t\t"+ seq);

				
			}
			
			
			
		}
		
		
		
	public static void main(String[] args) {
		String dong =null;
		
		zipController zControl = new zipController();
		zControl.selectDong(dong);
	}
}
