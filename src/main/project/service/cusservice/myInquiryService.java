package service.cusservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import dao.CusServiceDao;
import dto.CusServiceDTO;

public class myInquiryService {

	
	private CusServiceDao cusServiceDao;
	List<CusServiceDTO> list;
	
	@Autowired
	public myInquiryService(CusServiceDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}

	public List<CusServiceDTO> inquiryList(String mno) {
		list = cusServiceDao.inquiryList();
		
		return list;
	}
	

	
	
}
