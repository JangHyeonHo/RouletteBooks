package controller.trade;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.TBoardDetailCommand;
import controller.FrontControllerInterface;
import service.tboard.TBoardDetailService;
@Controller
@RequestMapping("/trade/detail")
public class TradeDetailController implements FrontControllerInterface {

	//권도완,유승재
	private TBoardDetailService tBoarddetailservice;
	
	@Autowired
	public TradeDetailController(TBoardDetailService tBoarddetailservice) {
		
		this.tBoarddetailservice = tBoarddetailservice;
	}
	


	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model,HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println("구매/판매 게시판 상세정보 오픈");
		TBoardDetailCommand detail = tBoarddetailservice.action(request);
		model.addAttribute("detail",detail);
	
		return "trade/TradeDetail";
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
