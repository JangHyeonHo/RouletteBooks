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
@RequestMapping("/freeboardwirte")
public class FreeBoardWriteController implements FrontControllerInterface {
	//권도완
	
	private FreeBoardWriteService service;
	
	@Autowired
	public FreeBoardWriteController(FreeBoardWriteService service) {
		super();
		this.service = service;
	}
	
	
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 글쓰기 오픈");
		return "freeboard/FreeBoardWrite";
	}


	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute FreeBoardWriteCommand command) {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 포스트 작동");
		command.CommandTest();
		service.action(command);
		return "redirect:/freeboardlist";
	}

}
