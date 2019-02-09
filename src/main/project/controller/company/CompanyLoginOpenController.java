package controller.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;

@Controller
@RequestMapping("/company/login")
public class CompanyLoginOpenController implements FrontControllerInterface {
	//장현호
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("로그인 페이지 오픈");
		return "company/member/Login";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
