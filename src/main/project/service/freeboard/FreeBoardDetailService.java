package service.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardDetailService {

	private FreeBoardDao freeboardDao;
	List<FreeBoard> freeboarddto;

	@Autowired
	public FreeBoardDetailService(FreeBoardDao freeboardDao) {
		this.freeboardDao = freeboardDao;
	}
	
	public List<FreeBoard> Detaillist(int fno) {
		freeboarddto = freeboardDao.detaillist(fno);
		
		return freeboarddto;
		
	}
}
