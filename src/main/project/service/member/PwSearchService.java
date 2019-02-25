package service.member;

import org.springframework.beans.factory.annotation.Autowired;

import command.PwSearchCommand;
import dao.RMemberDao;

public class PwSearchService {

	private RMemberDao pdao;
	
	@Autowired
	public PwSearchService(RMemberDao rdao) {
		this.pdao = rdao;
	}


	public String search(PwSearchCommand command) {
		// TODO Auto-generated method stub
		command.CommandTest();
		String pwok = pdao.Pwsearch(command);
		return pwok;
	}

}
