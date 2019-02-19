package service.freeboard;

import org.springframework.beans.factory.annotation.Autowired;

import command.FreeBoardDeleteCommand;
import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardDeleteService {
	private FreeBoardDao freeboardDao;
	@Autowired
	public FreeBoardDeleteService(FreeBoardDao freeboardDao) {
		this.freeboardDao = freeboardDao;
	}
	
	public FreeBoard Delete(FreeBoardDeleteCommand command) {
		FreeBoard freeboard = new FreeBoard();
		freeboard = freeboard.commandDelete(command);
		freeboardDao.Delete(freeboard);
		return freeboard;

	}
	
}
