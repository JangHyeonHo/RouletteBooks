package controller.company;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.LoginCommand;
import command.ManagerLoginCommand;
import controller.FrontControllerInterface;
import service.company.ManagerLoginService;

@Controller
@RequestMapping("/company/login")
public class CompanyLoginOpenController implements FrontControllerInterface {
	//장현호
	@Autowired
	private ManagerLoginService service;
	public void setService(ManagerLoginService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(HttpSession session, @ModelAttribute("command") ManagerLoginCommand command, BindingResult bindingResult) {
		// TODO Auto-generated method stub
		if(session.getAttribute("loginInfo")!=null) {
			return "redirect:/main";
		}
		System.out.println("로그인 페이지 오픈");
		return "company/member/Login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute("command") ManagerLoginCommand command, HttpSession session, Errors error , BindingResult bindingResult) {
		// TODO Auto-generated method stub
		command.CommandTest();
		service.action(command, error);
		return null;
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
