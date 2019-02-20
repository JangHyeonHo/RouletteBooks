package controller.company;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.CompanyManagerSignUpCommand;
import controller.FrontControllerInterface;
import dto.RManager;
import service.company.ManagerSignUpService;

@Controller
@RequestMapping("/company/signup")
public class CompanySignUpOpenController implements FrontControllerInterface {
	
	@Autowired
	private ManagerSignUpService service;
	public void setService(ManagerSignUpService service) {
		this.service = service;
	}
	
	//장현호
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("사원 회원가입 페이지 오픈함");
		return "company/member/SignUp";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(HttpServletRequest request, @ModelAttribute CompanyManagerSignUpCommand command) {
		// TODO Auto-generated method stub
		command.CommandTest();
		RManager manager = service.action(request, command);
		request.setAttribute("rmno", manager.getRmno());
		return "company/member/Welcome";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
