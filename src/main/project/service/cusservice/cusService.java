package service.cusservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import command.CusServiceCommand;
import dao.CusServiceDao;
import dto.CusServiceDTO;

public class cusService {
	private CusServiceDao cusServiceDao;

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
}