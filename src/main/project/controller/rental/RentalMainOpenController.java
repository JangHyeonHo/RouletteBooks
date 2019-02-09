package controller.rental;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
@Controller
@RequestMapping("rental")
public class RentalMainOpenController implements FrontControllerInterface {
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("렌탈 메인 오픈");
		return "rental/rental";
	}

	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
