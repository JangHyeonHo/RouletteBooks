package controller.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import service.company.PublisherListService;

@Controller
@RequestMapping("/company/sales/publisher/list")
public class CompanyPublisherListController implements FrontControllerInterface {
	//장현호
	@Autowired
	private PublisherListService service;
	public void setService(PublisherListService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model) {
		// TODO Auto-generated method stub
		System.out.println("출판사 리스트");
		service.action();
		return "company/Contract/BookCreateStoreList";
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
