package service.mypage;

import org.springframework.beans.factory.annotation.Autowired;

import command.MemberModifyCommand;
import dto.RMember;

public class ModifyService {

	private RMember rdao;
	
	@Autowired
	public ModifyService(RMember rdao) {
		this.rdao = rdao;
	}


	public void modify(MemberModifyCommand command) {
		// TODO Auto-generated method stub
		
	}
	
	

}
