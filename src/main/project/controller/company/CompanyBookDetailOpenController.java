package controller.company;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.BookModifyCommand;
import controller.FrontControllerInterface;
import dto.BookList;
import service.company.BookModifyService;

@Controller
@RequestMapping("/company/sales/book/detail")
public class CompanyBookDetailOpenController implements FrontControllerInterface {

	BookModifyService service;

	
	@Autowired
	public CompanyBookDetailOpenController(BookModifyService service) {
		this.service = service;
	}

	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute("bnum") int number,Model model) {
		// TODO Auto-generated method stub
		System.out.println("도서 상세(수정) 페이지 오픈");
		BookModifyCommand modify = service.getaction(number);
		model.addAttribute("modify", modify);
		return "company/Contract/Book/BookDetail";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute("bnum") int number, BookModifyCommand command,HttpServletRequest request, Model model) {
		System.out.println("도서 수정 포스트 작동");
		command.setNum(number);
		 service.action(number,command, request);
		model.addAttribute("command",command);
		return "redirect:list";
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
