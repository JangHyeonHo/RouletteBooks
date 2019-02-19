package service.tboard;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import command.TBoardDetailCommand;
import dao.TBoardDao;

public class TBoardDetailService {
	
	private TBoardDao tBoarddao;
	
	
	
	@Autowired
	public TBoardDetailService(TBoardDao tBoarddao) {
		
		this.tBoarddao = tBoarddao;
	}




	public TBoardDetailCommand action(HttpServletRequest request) {
		TBoardDetailCommand detail = new TBoardDetailCommand();
		int number = Integer.parseInt(request.getParameter("tnum"));
		 detail = tBoarddao.detail(number);

		
		return detail;
	}
}
