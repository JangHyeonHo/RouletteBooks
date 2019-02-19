package controller.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.PublisherRegistCommand;
import controller.FrontControllerInterface;
import other.AutoAlertProcess;
import service.company.PublisherRegisterService;

@Controller
@RequestMapping("/company/sales/publisher/regist")
public class CompanyPublisherRegistController implements FrontControllerInterface {
	//장현호
	@Autowired
	private PublisherRegisterService service;
	
	public void setService(PublisherRegisterService service) {
		this.service = service;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("출판사 등록");
		return "company/Contract/BookCreateRegist";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute PublisherRegistCommand command, Model model) {
		// TODO Auto-generated method stub
		command.CommandTest();
		if(service.action(command)) {
			return AutoAlertProcess.alertAfterRedirect(model,"완료","출판사 등록이 완료되었습니다.","./list");
		} else {
			return AutoAlertProcess.alertAfterRedirect(model,"실패","다시 등록해 주십시오","./regist");
		}
		
	}

}
