package controller.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;

@Controller
@RequestMapping("/company/signup")
public class CompanySiginUpOpenController implements FrontControllerInterface {
	//장현호
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("사원 회원가입 페이지 오픈함");
		return "company/member/SignUp";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
