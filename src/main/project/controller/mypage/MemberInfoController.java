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
import dto.RMember;
import service.mypage.InfoService;

@Controller
@RequestMapping("/mypage/myinfo")
public class MemberInfoController implements FrontControllerInterface {
//이원학
	
	private InfoService service;
	
	@Autowired
	public MemberInfoController(InfoService service) {
		this.service = service;
	}
	

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(String getmNo, Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:MyInfo");
		
		
		RMember dto = service.information(getmNo);
		model.addAttribute("dto",dto);
		
		return "mypage/MemberInfo";
		
		
		
		
		
		
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