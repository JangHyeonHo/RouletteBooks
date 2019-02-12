package service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;

import command.LoginCommand;
import command.LoginSessionInfomationCommand;
import dao.RMemberDao;

public class MemberLoginService {
	
	private RMemberDao memberDao;
	
	@Autowired
	public MemberLoginService(RMemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public LoginSessionInfomationCommand action(LoginCommand command, Errors error) {
		LoginSessionInfomationCommand sessionInfo = memberDao.passwordConfirming(command, error);
		
		if(sessionInfo!=null) {
			return sessionInfo;
		} else {
			return null;
		}
		
	}
	
}
