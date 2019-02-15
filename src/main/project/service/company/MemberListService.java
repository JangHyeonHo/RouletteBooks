package service.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.MemberListPageCommand;
import dao.RMemberDao;
import dto.RMember;

public class MemberListService {
	private RMemberDao memberDao;
	
	@Autowired
	public MemberListService(RMemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public Model action(MemberListPageCommand command, Model model){
		Model memberList = memberDao.memberListCall(command, model);
		
		return model;
	}
}
