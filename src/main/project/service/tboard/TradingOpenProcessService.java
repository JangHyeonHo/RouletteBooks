package service.tboard;

import org.springframework.beans.factory.annotation.Autowired;

import command.DoubleTradeCommand;
import dao.TBoardDao;

public class TradingOpenProcessService {
	
	@Autowired
	TBoardDao boardDao;
	public void setBoardDao(TBoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public DoubleTradeCommand Trading() {
		// TODO Auto-generated method stub
		return boardDao.tradingList();
	}

	public Integer buyer(String getmNo, String tnum) {
		// TODO Auto-generated method stub
		return boardDao.updateRequester(getmNo, tnum);
	}

}
