package controller.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.MemberListPageCommand;
import controller.FrontControllerInterface;
import dto.RMember;
import other.AutoPaging;
import service.company.MemberListService;

@Controller
@RequestMapping("/company/hr/memberlist")
public class CompanyHRMemListOpenController implements FrontControllerInterface {
	
	@Autowired
	private MemberListService service;
	public void setService(MemberListService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute MemberListPageCommand command, Model model) {
		// TODO Auto-generated method stub
		System.out.println("회원 리스트 오픈");
		if(command.getPage()==0) {
			command.setPage(1);
		}
		
		command.CommandTest();
		AutoPaging page = new AutoPaging(command.getPage(),20,10);
		List<RMember> list = service.action(command, page);
		page.setListCount(service.listSize(command));
		page.PagingTest();
		model.addAttribute("page",page);
		model.addAttribute("memberList",list);
		
		return "company/HR/HumanResourceMemberList";
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
