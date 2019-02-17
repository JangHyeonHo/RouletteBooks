package service.freeboard;

import org.springframework.beans.factory.annotation.Autowired;

import command.FreeBoardDetailCommand;
import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardDetailService {

	private FreeBoardDao freeboardDao;

	@Autowired
	public FreeBoardDetailService(FreeBoardDao freeboardDao) {
		this.freeboardDao = freeboardDao;
	}
	
	public void Detail(FreeBoardDetailCommand command) {
		FreeBoard freeboarddto = new FreeBoard();
		freeboarddto.commandDetail(command);
		freeboardDao.Detail(freeboarddto);
		
	}
}
