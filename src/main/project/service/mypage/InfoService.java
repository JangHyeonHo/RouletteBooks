package service.mypage;

import org.springframework.beans.factory.annotation.Autowired;

import dao.RMemberDao;

public class InfoService {

	
	private RMemberDao cusServiceDao;
	
		@Autowired
		public InfoService(RMemberDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}
	


	@Autowired
	public boolean action(String passwordChange, String getmNo) {
		// TODO Auto-generated method stub
		boolean rm = cusServiceDao.InfoConfirm(passwordChange, getmNo);
		
		return rm;
	}
}
