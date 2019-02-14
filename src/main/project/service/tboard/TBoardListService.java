package service.tboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import dao.TBoardDao;
import dto.TBoard;

public class TBoardListService {

	
	private TBoardDao tboarddao;
	List<TBoard> tboards;
	
	
	@Autowired
	public TBoardListService(TBoardDao tboarddao) {
		this.tboarddao = tboarddao;
	}




	public List<TBoard> tboardList() {
		
		
		tboards = tboarddao.tboardlist();
		
		
		return tboards;
	}

}
