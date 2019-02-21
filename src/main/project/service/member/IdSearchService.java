package service.member;

import org.springframework.beans.factory.annotation.Autowired;

import command.IdSearchCommand;
import dao.RMemberDao;
import dto.RMember;

public class IdSearchService {
	private RMemberDao rdao;
	
	@Autowired
	public IdSearchService(RMemberDao rdao) {
		this.rdao = rdao;
	}


	public String search(IdSearchCommand command) {
		System.out.println("-----서비스영역");
		command.CommandTest();

		String idok= rdao.Idsearch(command);
		return idok;
	}

}
