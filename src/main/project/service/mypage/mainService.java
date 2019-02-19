package service.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CusServiceDao;
import dto.CusServiceDTO;

public class mainService {

	
	private CusServiceDao cusServiceDao;
	List<CusServiceDTO> list;
	
	@Autowired
	public mainService(CusServiceDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}

	public List<CusServiceDTO> inquiryList(String mno) {
		list = cusServiceDao.inquiryList(mno);
		
		return list;
	}
}
