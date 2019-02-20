package controller.member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.LoginCommand;
import command.LoginSessionInfomationCommand;
import controller.FrontControllerInterface;
import other.PasswordAutoMD5;
import service.member.MemberLoginService;
@Controller
@RequestMapping("/member/login")
public class RbLoginController implements FrontControllerInterface {
	
	// 권도완, 장현호
	
	@Autowired
	private MemberLoginService service;
	public void setService(MemberLoginService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(HttpSession session, @ModelAttribute("command") LoginCommand command, BindingResult bindingResult) {
		// TODO Auto-generated method stub
		if(session.getAttribute("loginInfo")!=null) {
			return "redirect:/main";
		}
		System.out.println("아이디 찾기 오픈");
		return "member/Login";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute("command") LoginCommand command, HttpSession session, Errors error , BindingResult bindingResult) {
		// TODO Auto-generated method stub
		command.setPassword(PasswordAutoMD5.passwordChange(command.getPassword()));
		if(command.getLoginmaintain()!=null) {
			Cookie cookie = new Cookie("id",command.getEmail());
			cookie.setMaxAge(365);
			
		}
		command.CommandTest();
		LoginSessionInfomationCommand loginInfo = service.action(command, error);
		if(loginInfo!=null) {
			loginInfo.CommandTest();
			session.setAttribute("loginInfo", loginInfo);
		} else {
			
			return "member/Login";
		}
		
		return "redirect:/main";
	}

	@Override
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		return null;
	}

}
