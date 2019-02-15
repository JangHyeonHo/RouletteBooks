package service.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;

import command.ManagerLoginCommand;
import command.ManagerSessionInfomationCommand;
import dao.RManagerDao;

public class ManagerLoginService {
	private RManagerDao managerDao;
	
	@Autowired
	public ManagerLoginService(RManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	
	public ManagerSessionInfomationCommand action(ManagerLoginCommand command, Errors error) {
		ManagerSessionInfomationCommand sessionInfo = managerDao.passwordConfirming(command, error);
		
		if(sessionInfo!=null) {
			return sessionInfo;
		} else {
			return null;
		}
		
	}
	
}
