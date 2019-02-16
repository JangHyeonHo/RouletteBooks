package service.freeboard;

import command.FreeBoardDetailCommand;
import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardDetailService {

	private FreeBoardDao freeboardDao;

	public FreeBoardDetailService(FreeBoardDao freeboardDao) {
		this.freeboardDao = freeboardDao;
	}
	
	public void action(FreeBoardDetailCommand command) {
		FreeBoard freeboarddto = new FreeBoard();
		freeboarddto.commandDetail(command);
		freeboardDao.Detail(freeboarddto);
		
	}
}
