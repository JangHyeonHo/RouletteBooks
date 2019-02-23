package service.mypage;

import org.springframework.beans.factory.annotation.Autowired;

import dao.RMemberDao;
import dto.RMember;

public class InfoService {

	
	private RMemberDao rmemberDao;
	
		@Autowired
		public InfoService(RMemberDao rmemberDao) {
		this.rmemberDao = rmemberDao;
	}
	


	public boolean action(String passwordChange, String getmNo) {
		// TODO Auto-generated method stub
		System.out.println("MyInfoConfirm 서비스 지나감");
		boolean rm = rmemberDao.InfoConfirm(passwordChange, getmNo);
		
		return rm;
		
	}



	public RMember information(String getmNo) {
		// TODO Auto-generated method stub
		RMember dto = rmemberDao.information(getmNo);
	
		
		return dto;
	}
}
