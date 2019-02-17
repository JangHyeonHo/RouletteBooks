package service.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardUpdateService {
	private FreeBoardDao freeboardDao;
	List<FreeBoard> freeboarddto;
	
	@Autowired
	public FreeBoardUpdateService(FreeBoardDao freeboardDao) {
		this.freeboardDao = freeboardDao;
	}
	
	public List<FreeBoard> Update() {
		// TODO Auto-generated method stub
		freeboarddto = freeboardDao.Update();
		
		
		return freeboarddto;
	}

}
