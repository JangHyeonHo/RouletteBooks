package controller.freeboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.FreeBoardWriteCommand;
import controller.FrontControllerInterface;
import service.freeboard.FreeBoardWriteService;
@Controller
@RequestMapping("/freeboardlist")
public class FreeBoardListController implements FrontControllerInterface {

	//권도완
	private FreeBoardWriteService service;
	
	@Autowired
	public FreeBoardListController(FreeBoardWriteService service) {
		
		this.service = service;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 오픈");
		return "freeboard/FreeBoard";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessGet(@ModelAttribute FreeBoardWriteCommand command) {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 오픈");
		service.action(command);
		return null;
	}

}
