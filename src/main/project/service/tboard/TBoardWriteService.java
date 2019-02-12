package service.tboard;

import org.springframework.beans.factory.annotation.Autowired;

import command.TBoardWriteCommand;
import dao.TBoardDao;
import dto.TBoard;

public class TBoardWriteService {
	private TBoardDao tboardDao;

	@Autowired
	private TBoardWriteService(TBoardDao tboardDao) {
		this.tboardDao = tboardDao;
	}
	
	public void action(TBoardWriteCommand command) {
		TBoard tboard = new TBoard();
		tboard.commandChange(command);
		tboard.DTOTEST();
		
		tboardDao.insert(tboard);
		
	}
}
