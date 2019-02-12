package controller.customerservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;

@Controller
@RequestMapping("/customerservice/inquirywrite")
public class InquiryWriteContorller implements FrontControllerInterface {
	//이원학
	
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

	}
