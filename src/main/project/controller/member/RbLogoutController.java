package controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;

@Controller
@RequestMapping("/member/logout")
public class RbLogoutController implements FrontControllerInterface {

	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(HttpSession session) {
		// TODO Auto-generated method stub
		if(session.getAttribute("loginInfo")!=null) {
			session.invalidate();
			return "member/Logout";
		} else {
			return "redirect:login";
		}
		
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
