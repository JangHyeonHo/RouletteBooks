package controller.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import dto.TBoard;
import service.tboard.TBoardListService;
@Controller
@RequestMapping("/tradedetail")
public class TradeDetailController implements FrontControllerInterface {

	//권도완,유승재
	
	

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("구매/판매 게시판 상세정보 오픈");

		
		return "trade/TradeDetail";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
