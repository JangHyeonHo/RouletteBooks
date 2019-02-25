package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.PwSearchCommand;
import controller.FrontControllerInterface;
import other.AutoAlertProcess;
import service.member.PwSearchService;

@Controller
@RequestMapping("/member/searchpw")
public class PasswordSelectController implements FrontControllerInterface {
	
	private PwSearchService pwsearchservice;
	//권도완
	@Autowired
	public PasswordSelectController(PwSearchService pwsearchservice) {
		this.pwsearchservice = pwsearchservice;
	}
	
	
	@Override
	@RequestMapping(method=RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("비밀번호 찾기 오픈");
		return "member/PasswordSelect";
	}


	@RequestMapping(method=RequestMethod.POST)
	public String OpenProcessPost(PwSearchCommand command,Model model) {
		// TODO Auto-generated method stub
		System.out.println("비밀번호 디테일 123오픈");
		command.CommandTest();
		String pw = pwsearchservice.search(command);
		if(pw==null) {
			return AutoAlertProcess.alertAfterRedirect(model, "이거왜만듬", "입력한 정보에 맞는 비밀번호가 없습니다.", "searchpw");
		}
		model.addAttribute("pw", pw);
		return "member/PasswordSearchDetail";
	}


	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
