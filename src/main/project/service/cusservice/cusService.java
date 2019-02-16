package service.cusservice;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import command.CusServiceCommand;
import dao.CusServiceDao;
import dto.CusServiceDTO;
import dto.RMember;

public class cusService {
	private CusServiceDao cusServiceDao;
	List<CusServiceDTO> list;

	@Autowired
	private cusService(CusServiceDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}
	
	public void action(CusServiceCommand command) {
		CusServiceDTO cusService = new CusServiceDTO();
		cusService.commandChange(command);
		cusService.DTOTEST();
		cusServiceDao.insert(cusService);
	}
	
	public List<CusServiceDTO> inquiryList() {
		list = cusServiceDao.inquiryList();
		
		return list;
	}
	
	public RMember memberNo(String mno) {
		RMember member = cusServiceDao.selectById(mno);
		
		return member;
		
	}
}