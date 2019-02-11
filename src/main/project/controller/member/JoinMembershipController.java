package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.SignUpCommand;
import controller.FrontControllerInterface;
import service.member.MemberSignUpService;

@Controller
@RequestMapping("/member/signup")
public class JoinMembershipController implements FrontControllerInterface {
//이원학, 장현호
	@Autowired
	private MemberSignUpService service;
	public void setService(MemberSignUpService service) {
		this.service = service;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("open:회원가입");
		return "member/joinMembership";
	}
	
	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//OverLoading
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute SignUpCommand command) {
		// TODO Auto-generated method stub
		System.out.println("작업정보 도착");
		command.CommandTest();
		service.SignUp(command);
		
		return null;
	}

	

}

