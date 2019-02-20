package service.tboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.TBoardListCommand;
import dao.TBoardDao;
import dto.TBoard;
import other.AutoPaging;

public class TBoardListService {

	
	private TBoardDao tboarddao;
	
	
	@Autowired
	public TBoardListService(TBoardDao tboarddao) {
		this.tboarddao = tboarddao;
	}




	public List<TBoardListCommand> tboardList(AutoPaging page) {
		
		
		List<TBoardListCommand> tboards = tboarddao.tboardlist(page);
		
		
		return tboards;
	}

}
