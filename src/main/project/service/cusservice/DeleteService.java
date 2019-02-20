package service.cusservice;

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
	
	
	public void delete(int csNo) {
		// TODO Auto-generated method stub
//		CusServiceDTO serviceDTO = new CusServiceDTO();
//		serviceDTO.getCsNo();
		cusServiceDao.delete(csNo);

		
		
	}

}
