package controller.freeboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.FreeBoardDeleteCommand;
import controller.FrontControllerInterface;
import service.freeboard.FreeBoardDeleteService;
@Controller
@RequestMapping("/freeboard/delete")
public class FreeBoardDeleteController implements FrontControllerInterface {
	// 권도완
	private FreeBoardDeleteService freeboarddeleteservice;
	
	@Autowired
	public FreeBoardDeleteController(FreeBoardDeleteService freeboarddeleteservice) {
		this.freeboarddeleteservice = freeboarddeleteservice;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute FreeBoardDeleteCommand command) {
		// TODO Auto-generated method stub
		System.out.println("게시판 삭제오픈");
		freeboarddeleteservice.Delete(command);
		command.commandTast();
		return "redirect:/freeboardlist";
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
