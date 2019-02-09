package controller.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;

@Controller
@RequestMapping("/company/main")
public class CompanyMainPageOpenController implements FrontControllerInterface {

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("사원 메인 페이지 오픈");
		return "company/main";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
