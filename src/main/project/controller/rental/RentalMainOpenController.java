package controller.rental;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.RentalCommand;
import controller.FrontControllerInterface;
import service.rental.RentalListService;
@Controller
@RequestMapping("/rental")
public class RentalMainOpenController implements FrontControllerInterface {
	
	RentalListService service;
	
	@Autowired
	public RentalMainOpenController(RentalListService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model) {

		System.out.println("렌탈 메인 오픈");
		
		List<RentalCommand> list = service.action();
		model.addAttribute("list", list);
		System.out.println(list.get(0).getBname());
		
		return "rental/rental";
	}

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
