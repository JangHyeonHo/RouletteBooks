package service.cusservice;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CusServiceDao;
import dto.CusServiceDTO;

public class DetailService {
	
	private CusServiceDao cusServiceDao;
	
	@Autowired
	public DetailService(CusServiceDao cusServiceDao) {
		this.cusServiceDao = cusServiceDao;
	}
	
	public CusServiceDTO detail(int listcsNo) {
		CusServiceDTO dto = cusServiceDao.detail(listcsNo);
		
		return dto;
	}
	
	

}
