package controller.customerservice;

import org.springframework.beans.factory.annotation.Autowired;

import command.CusServiceCommand;
import dao.CusServiceDao;
import dto.CusServiceDTO;

public class DeleteService {

	
	private CusServiceDao cusServiceDao;
	
	@Autowired
	public DeleteService(CusServiceDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}
	
	
	public void delete(CusServiceCommand command) {
		// TODO Auto-generated method stub
		CusServiceDTO dto = new CusServiceDTO();
		dto.commandChange(command);
		cusServiceDao.delete(dto);
		
	}

}
