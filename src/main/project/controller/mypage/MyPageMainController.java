package controller.mypage;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.LoginSessionInfomationCommand;
import controller.FrontControllerInterface;
import dto.CusServiceDTO;
import service.mypage.mainService;



@Controller
@RequestMapping("/mypage/main")
public class MyPageMainController implements FrontControllerInterface {
//이원학
	
	private mainService service;
	
	@Autowired
	public MyPageMainController(mainService service) {
		this.service = service;
	}
	

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(HttpSession session, Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:마이페이지");
		session.getAttribute("loginInfo");
		LoginSessionInfomationCommand command = null;
		if(session.getAttribute("loginInfo")!= null) {
			command = (LoginSessionInfomationCommand) session.getAttribute("loginInfo");
		}
		List<CusServiceDTO> list = service.inquiryList(command.getmNo());
		model.addAttribute("List",list);
		return "mypage/mypage";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping()
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		return null;
	}

}
