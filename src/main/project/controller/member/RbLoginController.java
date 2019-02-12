package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.LoginCommand;
import controller.FrontControllerInterface;
import service.member.MemberLoginService;
@Controller
@RequestMapping("/member/login")
public class RbLoginController implements FrontControllerInterface {
	
	@Autowired
	MemberLoginService service;
	

	// 권도완
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("아이디 찾기 오픈");
		return "member/Login";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute LoginCommand command) {
		// TODO Auto-generated method stub
		
		return "redirect:/main";
	}

}
