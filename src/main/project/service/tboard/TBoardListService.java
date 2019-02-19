package service.tboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.TBoardListCommand;
import dao.TBoardDao;
import dto.TBoard;

public class TBoardListService {

	
	private TBoardDao tboarddao;
	
	
	@Autowired
	public TBoardListService(TBoardDao tboarddao) {
		this.tboarddao = tboarddao;
	}




	public List<TBoardListCommand> tboardList() {
		
		
		List<TBoardListCommand> tboards = tboarddao.tboardlist();
		
		
		return tboards;
	}

}
