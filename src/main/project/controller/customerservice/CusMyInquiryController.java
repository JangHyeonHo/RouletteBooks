package controller.customerservice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.FreeBoardListPageCommand;
import command.LoginSessionInfomationCommand;
import controller.FrontControllerInterface;
import dto.CusServiceDTO;
import other.AutoPaging;
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
	public String OpenProcessGet(@ModelAttribute FreeBoardListPageCommand comman, HttpSession session, Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:내 문의내역");
		
		  if(comman.getPage() == 0) {
			  comman.setPage(1);
		  }
		
		AutoPaging ap = new AutoPaging(comman.getPage(),8,4);//(현재페이지번호, 리스트수,페이지번호 출력수)
		session.getAttribute("loginInfo");
		LoginSessionInfomationCommand command = null;
		if(session.getAttribute("loginInfo")!= null) {
			command = (LoginSessionInfomationCommand) session.getAttribute("loginInfo");
		}
		List<CusServiceDTO> list = service.inquiryList(command.getmNo(),ap);
		ap.setListCount(service.listCount());
		ap.PagingTest();
		model.addAttribute("ap",ap);
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
