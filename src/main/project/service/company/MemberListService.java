package service.company;

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
	
	public List<RMember> action(MemberListPageCommand command, Model model){
		List<RMember> list = memberDao.memberListCall(command, model);
		
		return list;
	}
}
