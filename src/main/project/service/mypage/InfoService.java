package service.mypage;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CusServiceDao;
import dao.MyPageDao;
import dto.RMember;

public class InfoService {

	
	private MyPageDao cusServiceDao;
	
		@Autowired
		public InfoService(MyPageDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}
	


	@Autowired
	public RMember action(String passwordChange, String getmNo) {
		// TODO Auto-generated method stub
		RMember rm = cusServiceDao.InfoConfirm(passwordChange, getmNo);
		
		return rm;
	}
}
