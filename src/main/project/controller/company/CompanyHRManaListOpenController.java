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
import dto.RManager;
import service.company.ManagerListService;

@Controller
@RequestMapping("/company/hr/managerlist")
public class CompanyHRManaListOpenController implements FrontControllerInterface {
	//장현호
	@Autowired
	ManagerListService Mlistservice;
	
	public void setMlistservice(ManagerListService mlistservice) {
		Mlistservice = mlistservice;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute MemberListPageCommand command,Model model) {
		// TODO Auto-generated method stub
		System.out.println("사원 리스트 오픈");
		List<RManager> list = Mlistservice.getList(command);
		model.addAttribute("rlist", list );
		return "company/HR/HumanResourceManagerList";
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
