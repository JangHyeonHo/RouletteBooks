package service.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;

import command.ManagerLoginCommand;
import dao.RManagerDao;

public class ManagerLoginService {
	private RManagerDao managerDao;
	
	@Autowired
	public ManagerLoginService(RManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	
	public void action(ManagerLoginCommand command, Errors error) {
		
	}
	
}
