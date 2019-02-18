package service.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.FreeBoardUpdateCommand;
import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardUpdateService {
	private FreeBoardDao freeboardDao;
	  List<FreeBoard> freeboards;
	
	@Autowired
	public FreeBoardUpdateService(FreeBoardDao freeboardDao) {
		this.freeboardDao = freeboardDao;
	}
	
	public List<FreeBoard> Update(FreeBoard freeboard,FreeBoardUpdateCommand command) {
		// TODO Auto-generated method stub
		command.commandTast();
		
		 List<FreeBoard> freeboards = freeboardDao.Update(freeboard);
		return freeboards;

	}

}
