package controller.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;

@Controller
@RequestMapping("/company/sales/publisher/list")
public class CompanyPublisherListController implements FrontControllerInterface {
	//장현호
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("출판사 리스트");
		return "company/Contract/BookCreateStoreList";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
