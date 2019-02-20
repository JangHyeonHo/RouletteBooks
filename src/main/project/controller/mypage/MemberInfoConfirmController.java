package controller.mypage;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.LoginSessionInfomationCommand;
import controller.FrontControllerInterface;
import other.PasswordAutoMD5;
import service.cusservice.cusService;
import service.mypage.InfoService;

@Controller
@RequestMapping("/mypage/myinfoconfirm")
public class MemberInfoConfirmController implements FrontControllerInterface {
//이원학
	
	private InfoService service;
	
	
	 	@Autowired
		public MemberInfoConfirmController(InfoService service) {
		
		this.service = service;
	}
	
	
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		
		System.out.println("open:내 정보보기");
		return "mypage/MemberInfoConfirm";
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@RequestParam("password") String password, HttpSession session) {
		// TODO Auto-generated method stub
		System.out.println("password : "+password);
		
		LoginSessionInfomationCommand com = (LoginSessionInfomationCommand)session.getAttribute("loginInfo");
		service.action(PasswordAutoMD5.passwordChange(password), com.getmNo());
		return "redirect:/mypage/myinfo";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}