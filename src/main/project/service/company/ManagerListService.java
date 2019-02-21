package service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.MemberListPageCommand;
import dao.RManagerDao;
import dto.RManager;

public class ManagerListService {

	@Autowired
	private RManagerDao dao;
	public void setDao(RManagerDao dao) {
		this.dao = dao;
	}
	public List<RManager> getList(MemberListPageCommand command) {
		// TODO Auto-generated method stub
		
		
		return dao.ListCall(command);
	}
	
	

}
