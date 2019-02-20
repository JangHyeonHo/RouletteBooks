package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import controller.FrontControllerInterface;
@Controller
@RequestMapping("/member/searchid")
public class IdSerachController implements FrontControllerInterface {

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("아이디 찾기 오픈");
		return "member/IdSelect";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@RequestParam("num")String num /*받아올태그이름*/) {
		// TODO Auto-generated method stub
		System.out.println(num);
		return null;
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
