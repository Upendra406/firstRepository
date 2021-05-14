package com.jspiders.basics.util;

import java.util.List;

import com.jspiders.basics.dao.MobileHqlDao;
import com.jspiders.basics.dto.MobileDTO;

public class Test {

	public static void main(String[] args) {

		MobileDTO mobileDTO = new MobileDTO();
		mobileDTO.setBrand("samsung");
		mobileDTO.setColor("pink");
		mobileDTO.setModel("promax");
		mobileDTO.setMemory("136"); 
		mobileDTO.setPrice(999.50);
		 
		
	//	MobileDAO mobileDAO = new MobileDAO();
	//	mobileDAO.saveMobileDetails(mobileDTO);
		
	//	System.out.println("Data Inserted");
		
	//	MobileDTO dto = mobileDAO.getMobileDetailsByModel("oppo a9");
	//	System.out.println(dto);
		
		MobileHqlDao mobileHqlDao = new MobileHqlDao();
		List<MobileDTO> mobiles = mobileHqlDao.getMobiles();
		
//		for (MobileDTO mobileDTO2 : mobiles) {
//			System.out.println(mobileDTO2);
//		}
//		
//		mobileHqlDao.getMobiles().forEach(each -> { System.out.println(each); });
		
		mobileHqlDao.getMobileByModel("note 10 pro").forEach(each -> {
			System.out.println(each);
		});


	}


}
