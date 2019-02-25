package controller.trade;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.LoginSessionInfomationCommand;
import controller.FrontControllerInterface;
import other.AutoAlertProcess;
import service.tboard.TradingOpenProcessService;

@Controller
@RequestMapping("/trade/trader")
public class TradeTraderController implements FrontControllerInterface {
	
	@Autowired
	TradingOpenProcessService service;
	public void setService(TradingOpenProcessService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute String tnum, HttpSession session, Model model) {
		// TODO Auto-generated method stub
		if(session.getAttribute("loginInfo") == null) {
			return AutoAlertProcess.alertAfterRedirect(model, "로그인", "로그인이 필요한 구간입니다!", "../member/login");
		}
		LoginSessionInfomationCommand loginInfo = (LoginSessionInfomationCommand) session.getAttribute("loginInfo");
		service.buyer(loginInfo.getmNo(),tnum);
		
		
		return "redirect:/trading?tnum="+tnum;
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
