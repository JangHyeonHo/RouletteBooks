package service.cusservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.LoginSessionInfomationCommand;
import command.ManagerSessionInfomationCommand;
import dao.CusServiceDao;
import dto.CusServiceDTO;
import other.AutoPaging;

public class myInquiryService {

	
	private CusServiceDao cusServiceDao;
	List<CusServiceDTO> list;
	
	@Autowired
	public myInquiryService(CusServiceDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}

	public List<CusServiceDTO> inquiryList(String mno, AutoPaging ap) {
		list = cusServiceDao.inquiryList(mno, ap);
		
		return list;
	}
	

	
	
}
