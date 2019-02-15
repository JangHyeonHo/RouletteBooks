package controller.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import controller.FrontControllerInterface;
import dto.CusServiceDTO;
import service.cusservice.myInquiryService;

@Controller
@RequestMapping("/customerservice/myinquiry")
public class CusMyInquiryController implements FrontControllerInterface {
//이원학
	
	private myInquiryService service;
	
	@Autowired
	public CusMyInquiryController(myInquiryService service) {
		this.service = service;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:내 문의내역");
		List<CusServiceDTO> list = service.inquiryList();
		model.addAttribute("List",list);
		return "customerservice/CusMyInquiry";
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
