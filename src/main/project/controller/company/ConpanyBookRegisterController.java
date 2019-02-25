package controller.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import other.AutoAlertProcess;
import service.company.BookRegisterService;
@Controller
@RequestMapping("/company/sales/book/register")
public class ConpanyBookRegisterController implements FrontControllerInterface {

	
	BookRegisterService service;
	
	@Autowired
	public ConpanyBookRegisterController(BookRegisterService service) {
		this.service = service;
	}

	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute("bnum") int number,Model model) {
		System.out.println("등록 작동");
		service.action(number);
		// TODO Auto-generated method stub
		return AutoAlertProcess.alertAfterRedirect(model, "확인", "등록되었습니다.", "list");
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
