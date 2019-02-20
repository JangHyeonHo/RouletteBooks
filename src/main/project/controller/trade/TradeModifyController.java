package controller.trade;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
@Controller
@RequestMapping("trade/modify")
public class TradeModifyController implements FrontControllerInterface {

	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute("tnum") int number,HttpSession session) {
		System.out.println("중고게시판 수정 오픈");
		// TODO Auto-generated method stub
		if(session.getAttribute("loginInfo")==null) {
			System.out.println("널임");
			return "trade/TradeDetail";
		}else{
		return "trade/TradeBoardmodify";
		}
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
