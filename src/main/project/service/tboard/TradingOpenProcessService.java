package service.tboard;

import org.springframework.beans.factory.annotation.Autowired;

import dao.TBoardDao;

public class TradingOpenProcessService {
	
	@Autowired
	TBoardDao boardDao;
	public void setBoardDao(TBoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public void Trading() {
		// TODO Auto-generated method stub
		
	}

	public Integer buyer(String getmNo) {
		// TODO Auto-generated method stub
		return boardDao.updateRequester(getmNo);
	}

}
