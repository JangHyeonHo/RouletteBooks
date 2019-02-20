package controller.mypage;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.LoginSessionInfomationCommand;
import controller.FrontControllerInterface;
import other.AutoAlertProcess;
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
	public String OpenProcessPost(@RequestParam("password") String password, HttpSession session, Model model) {
		// TODO Auto-generated method stub
		System.out.println("password : "+password);
		
		LoginSessionInfomationCommand com = (LoginSessionInfomationCommand)session.getAttribute("loginInfo");
		if (!service.action(PasswordAutoMD5.passwordChange(password), com.getmNo())) {
				return AutoAlertProcess.alertAfterRedirect(model, "비밀번호오류","비밀번호가 올바르지 않습니다." , "myinfoconfirm");
		}
		return "redirect:/mypage/myinfo";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}