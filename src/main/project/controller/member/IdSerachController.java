package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.IdSearchCommand;
import controller.FrontControllerInterface;
import other.AutoAlertProcess;
import service.member.IdSearchService;
@Controller
@RequestMapping("/member/searchid")
public class IdSerachController implements FrontControllerInterface {
	
	private IdSearchService searchService;
	
	@Autowired
	public IdSerachController(IdSearchService searchService) {
		this.searchService = searchService;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("아이디 찾기 오픈");
		return "member/IdSelect";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(IdSearchCommand command, Model model) {
		// TODO Auto-generated method stub
		System.out.println("-----컨트롤러 영역");
		command.CommandTest();
		
		String email = searchService.search(command);
		if(email==null) {
			return AutoAlertProcess.alertAfterRedirect(model, "아이디가 존재안함", "아이디가 존재하지 않습니다", "searchid");
		}
		model.addAttribute("id", email);

		
		return "member/IdSearchDetail";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
