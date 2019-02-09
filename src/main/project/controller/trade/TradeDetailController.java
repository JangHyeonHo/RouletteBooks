package controller.trade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
@Controller
@RequestMapping("/tradedetail")
public class TradeDetailController implements FrontControllerInterface {

	//권도완
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
