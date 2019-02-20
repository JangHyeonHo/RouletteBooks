package service.tboard;

import org.springframework.beans.factory.annotation.Autowired;

import dao.TBoardDao;
import dto.TBoard;

public class TBoardDeleteService {
	
	
	TBoardDao tboarddao;
	
	
	@Autowired
	public TBoardDeleteService(TBoardDao tboarddao) {
		this.tboarddao = tboarddao;
	}



	public void action(int number) {
		
	tboarddao.delete(number);
	
	
	}
}
