package controller.trade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
@Controller
@RequestMapping("/trade/boardwrite")
public class TradeBoardWriteController implements FrontControllerInterface {

	@Override
	@RequestMapping(method=RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("중고거래 글쓰기 오픈");
		return "trade/TradeBoardWrite";
	}

	@Override
	@RequestMapping(method=RequestMethod.POST)
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
