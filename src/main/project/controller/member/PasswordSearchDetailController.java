package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
@Controller
@RequestMapping("/member/searchpwdetail")
public class PasswordSearchDetailController implements FrontControllerInterface {
	//권도완
	@Override
	@RequestMapping(method=RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("비밀번호 상세페이지 오픈");
		return "member/PasswordSearchDetail";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
