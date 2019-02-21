package service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.MemberListPageCommand;
import dao.RMemberDao;
import dto.RMember;
import other.AutoPaging;

public class MemberListService {
	private RMemberDao memberDao;
	
	@Autowired
	public MemberListService(RMemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public List<RMember> action(MemberListPageCommand command, AutoPaging page){
		List<RMember> list = memberDao.memberListCall(command, page);
		
		return list;
	}

	public int listSize(MemberListPageCommand command) {
		// TODO Auto-generated method stub
		return 0;
	}
}
