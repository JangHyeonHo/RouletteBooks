package controller.trade;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.TBoardListCommand;
import controller.FrontControllerInterface;
import other.AutoPaging;
import other.ContextPathRoute;
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
	public String OpenProcessGet(Model model, HttpServletRequest request) {
		int num = 1;
		
		if(request.getParameter("page")!=null) {
			System.out.println("널아니니?");
			num = Integer.parseInt(request.getParameter("page"));
		}
		

		AutoPaging page = new AutoPaging(num, 10, 10 );
		System.out.println("구매/판매 게시판 오픈");
		List<TBoardListCommand> tboardlist =  tboardlistservice.tboardList(page);
		page.setListCount(tboardlistservice.listcount());
		page.PagingTest();
		model.addAttribute("page",page );
		model.addAttribute("directory", ContextPathRoute.route(request, "trade/uploadImage/") );
		model.addAttribute("tboardlist",tboardlist);
		
		/*System.out.println("글번호"+tboardlist.get(0).gettNum()
						+"글내용"+tboardlist.get(0).gettContent()
						+"가격"+tboardlist.get(0).gettPrice()	);*/
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
