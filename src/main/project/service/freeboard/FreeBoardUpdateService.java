package service.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.FreeBoardUpdateCommand;
import command.LoginSessionInfomationCommand;
import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardUpdateService {
	private FreeBoardDao freeboardDao;

	
	@Autowired
	public FreeBoardUpdateService(FreeBoardDao freeboardDao) {
		this.freeboardDao = freeboardDao;
	}
	
	public FreeBoard Update(int fno,LoginSessionInfomationCommand command) {
		// TODO Auto-generated method stub
		
		
		 FreeBoard freeboards = freeboardDao.detail(fno,command.getmNo());
		return freeboards;

	}

	public void PostUpdate(FreeBoardUpdateCommand command) {
		// TODO Auto-generated method stub
		FreeBoard freeboard = new FreeBoard();
		freeboard = freeboard.commandUpdate(command);
		
		freeboardDao.Update(freeboard);
	
	}

}
