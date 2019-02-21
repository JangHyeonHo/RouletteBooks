package controller.trade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import service.tboard.TradingOpenProcessService;


/**
 * <b>트레이드 프론트 컨트롤러</b>
 * @see FrontControllerInterface
 * @author 장현호, 유승재
 * @version 1.0
 * */
@Controller
@RequestMapping("/trade/trading")
public class TreadeTradingController implements FrontControllerInterface {
	
	@Autowired
	TradingOpenProcessService service;
	public void setService(TradingOpenProcessService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model) {
		System.out.println("중고거래 구매하기 오픈");
		service.Trading();
		return "payment/TransactionDetail";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		return null;
	}

}
