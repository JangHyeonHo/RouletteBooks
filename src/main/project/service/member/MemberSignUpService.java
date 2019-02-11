package service.member;

import org.springframework.beans.factory.annotation.Autowired;

import command.SignUpCommand;
import dao.RMemberDao;
import dto.RMember;

public class MemberSignUpService {
	private RMemberDao memberDao;
	
	@Autowired
	public MemberSignUpService(RMemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void SignUp(SignUpCommand command) {
		RMember member = new RMember();
		member.commandChange(command);
		
		member.setmNo(memberDao.mnoCall());
		
		member.DTOTEST();
		
		
//		memberDao.insertMember(member);
		
	}
	
	
}
