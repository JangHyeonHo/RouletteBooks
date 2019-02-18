package service.freeboard;

import org.springframework.beans.factory.annotation.Autowired;

import command.FreeBoardWriteCommand;
import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardWriteService {
	private FreeBoardDao freeboarddao;

	@Autowired
	public FreeBoardWriteService(FreeBoardDao freeboarddao) {
		this.freeboarddao = freeboarddao;
	}

	public void action(FreeBoardWriteCommand command) {
		FreeBoard freeboard = new FreeBoard();
		freeboard.commandChange(command);
		freeboard.DTOTEST();
		
		freeboarddao.insert(freeboard);
	}
	
}
