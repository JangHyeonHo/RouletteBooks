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
@RequestMapping("/tradelist")
public class TradeListController implements  FrontControllerInterface {
	//권도완,유승재	
	
	private TBoardListService tboardlistservice;
	
	@Autowired
	public TradeListController(TBoardListService tboardlistservice) {
	this.tboardlistservice = tboardlistservice;
}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model) {
		System.out.println("구매/판매 게시판 오픈");
		List<TBoard> tboardlist =  tboardlistservice.tboardList();
		model.addAttribute("tboardlist",tboardlist);
		
		System.out.println("글번호"+tboardlist.get(0).gettNum()
						+"글내용"+tboardlist.get(0).gettContent()
						+"가격"+tboardlist.get(0).gettPrice()	);
		return "trade/TradeList";
	
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
