package controller.trade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.TBoardDetailCommand;
import command.TBoardWriteCommand;
import controller.FrontControllerInterface;
import other.AutoAlertProcess;
import service.tboard.TBoardModifyService;
@Controller
@RequestMapping("/trade/modify")
public class TradeModifyController implements FrontControllerInterface {

	
	
	TBoardModifyService service;
	
	
	@Autowired
	public TradeModifyController(TBoardModifyService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute("tnum") int number,Model model) {
		System.out.println("중고게시판 수정 오픈");
		// TODO Auto-generated method stub
		TBoardDetailCommand tboard = service.getaction(number);
		model.addAttribute("tboard", tboard);
		tboard.CommandTest();
		return "trade/TradeBoardmodify";
		
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(HttpSession session,@ModelAttribute("tnum") int number,TBoardWriteCommand command,Model model,HttpServletRequest request) {
			System.out.println("중고게시판 수정 포스트 작동");
			command.CommandTest();
		service.action(number,session,command,request);
		model.addAttribute("command", command);
		
		return AutoAlertProcess.alertAfterRedirect(model, "수정 완료", "수정이 정상적으로 완료되었습니다", "detail?tnum="+number);
		
	}

	
	
	
	@Override
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
