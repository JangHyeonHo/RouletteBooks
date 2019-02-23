package controller.mypage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.MemberModifyCommand;
import controller.FrontControllerInterface;
import dto.RMember;
import service.mypage.InfoService;
import service.mypage.ModifyService;

@Controller
@RequestMapping("/mypage/modify")
public class MemberModifyController implements FrontControllerInterface {
//이원학
	
	private InfoService service;
	private ModifyService mservice;
	
	@Autowired
	public MemberModifyController(InfoService service,ModifyService mservice) {
	this.service = service;
	this.mservice = mservice;
	}
	

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(String mno, Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:내정보 수정");
		
		RMember dto = service.information(mno);
		model.addAttribute("dto", dto);
		return "mypage/MemberModify";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute MemberModifyCommand command, Model model) {
		// TODO Auto-generated method stub
		System.out.println("정보 수정 psot 작성");
		
		mservice.modify(command);
		
		return "redirect:/mypage/myinfo";
	}


	@Override
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}