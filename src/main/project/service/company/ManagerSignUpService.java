package service.company;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import command.CompanyManagerSignUpCommand;
import dao.RManagerDao;
import dto.RManager;

public class ManagerSignUpService {
	
	private RManagerDao managerDao;
	
	@Autowired
	public ManagerSignUpService(RManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	

	public RManager action(HttpServletRequest request, CompanyManagerSignUpCommand command) {
		RManager manager = new RManager();
		manager.commandChange(request, command);
		
		manager.setRmno(managerDao.rmnoCall());
		
		manager.DTOTEST();
		
		managerDao.insertManager(manager);
		return manager;
	}
	
}
