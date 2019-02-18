package controller.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.CusServiceCommand;
import controller.FrontControllerInterface;
import service.cusservice.cusService;

@Controller
@RequestMapping("/customerservice/inquirywrite")
public class InquiryWriteContorller implements FrontControllerInterface {
	//이원학
	
	private cusService service;
	
	
	    @Autowired
		public InquiryWriteContorller(cusService service) {
		
		this.service = service;
	}

		@Override
		@RequestMapping(method = RequestMethod.GET)
		public String OpenProcessGet() {
			// TODO Auto-generated method stub
			System.out.println("open:문의하기");
			return "customerservice/InquiryWriter";
		}

		@Override
		public String OpenProcessPost() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public String OpenProcessPost(@ModelAttribute CusServiceCommand command) {
			System.out.println("1대1 문의 포스트 작동");
			command.CommandTest();
			service.action(command);
			return "redirect:/customerservice/inquirywrite";
		}

}
