package controller.trade;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.TBoardListCommand;
import command.TBoardWriteCommand;
import controller.FrontControllerInterface;
import service.tboard.TBoardWriteService;

@Controller
@RequestMapping("/trade/boardwrite")
public class TradeBoardWriteController implements FrontControllerInterface {

	//유승재
	
		
		private TBoardWriteService service;
		
		@Autowired
		public TradeBoardWriteController(TBoardWriteService service) {
		this.service = service;
	}

		@Override
		@RequestMapping(method=RequestMethod.GET)
		public String OpenProcessGet() {
			// TODO Auto-generated method stub
			System.out.println("중고거래 글쓰기 오픈");
			return "trade/TradeBoardWrite";
		}

		@Override
		public String OpenProcessPost() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public String OpenProcessPost(@ModelAttribute TBoardWriteCommand command, HttpServletRequest request, Model model) {
			System.out.println("중고거래 포스트 작동");
			command.CommandTest();
		
			model.addAttribute("command", command);
			service.action(command,request);	

			
			return "redirect:/tradelist";
		}
}
