package controller.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.PublisherRegistCommand;
import controller.FrontControllerInterface;

@Controller
@RequestMapping("/company/sales/publisher/contract")
public class CompanyBookContractRegistController implements FrontControllerInterface {
	//장현호
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("출판사 계약 등록");
		return "company/Contract/BookContractRegistSystem";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
