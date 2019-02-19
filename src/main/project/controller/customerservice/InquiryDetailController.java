package controller.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import controller.FrontControllerInterface;
import dto.CusServiceDTO;
import service.cusservice.DetailService;


@Controller
public class InquiryDetailController implements FrontControllerInterface {
	
	
	private DetailService detailService;
	
		@Autowired
		public InquiryDetailController(DetailService detailService) {
		this.detailService = detailService;
	}

		@RequestMapping("/customerservice/detail={fuck}")
	public String OpenProcessGet(@PathVariable("fuck")int listcsNo, Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:디테일");
		CusServiceDTO dto = detailService.detail(listcsNo);
		if(dto == null) {
			return "customerservice/CustomerService";
		}
		model.addAttribute("dto",dto);
		
		return "customerservice/inquiryDetail";
		
	
	}
	
	
	
	@Override
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
