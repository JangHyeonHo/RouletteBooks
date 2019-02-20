package service.mypage;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CusServiceDao;

public class InfoService {

	
	private CusServiceDao cusServiceDao;
	
		@Autowired
		public InfoService(CusServiceDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}
	


	@Autowired
	public void action(String passwordChange, String getmNo) {
		// TODO Auto-generated method stub
		
	}
}
