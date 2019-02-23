package controller.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import dto.BookList;
import service.company.BookListService;

@Controller
@RequestMapping("/company/sales/book/list")
public class CompanyBookServiceListController implements FrontControllerInterface {
	//장현호 승재
	
	BookListService service;
	
	@Autowired
	public CompanyBookServiceListController(BookListService service) {
		this.service = service;
	}


	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model) {
		// TODO Auto-generated method stub
	System.out.println("도서 리스트 사이트 오픈");
	List<BookList> list = service.action();
	model.addAttribute("list", list);
	 return "company/Contract/Book/BookServiceList";
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
