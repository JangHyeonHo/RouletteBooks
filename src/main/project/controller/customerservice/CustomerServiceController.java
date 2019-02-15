package controller.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import dto.CusServiceDTO;
import dto.RMember;
import service.cusservice.cusService;

@Controller
@RequestMapping("/customerservice/main")
public class CustomerServiceController implements FrontControllerInterface {
//이원학
	
	
	private cusService service;
	
	@Autowired
	public CustomerServiceController(cusService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(/*@PathVariable("mno") String mno,*/ Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:고객센터");
		//System.out.println("mno:"+mno);
		//RMember member = service.memberNo(mno);
		//model.addAttribute("member",member);
		List<CusServiceDTO> list = service.inquiryList(mno);
		model.addAttribute("List",list);
		return "customerservice/CustomerService";
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
