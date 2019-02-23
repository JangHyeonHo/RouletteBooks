package controller.trade;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import other.AutoAlertProcess;
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
	public String OpenProcessGet(Model model, @ModelAttribute String tnum,HttpSession session) {
		System.out.println("중고거래 구매하기 오픈");
		if(tnum==null) {
			return AutoAlertProcess.alertAfterRedirect(model, "에러", "잘못된 접근입니다!", "../main");
		}
		if(session.getAttribute("loginInfo")==null) {
			return AutoAlertProcess.alertAfterRedirect(model, "로그인", "로그인이 필요합니다!", "../member/login");
		}
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
