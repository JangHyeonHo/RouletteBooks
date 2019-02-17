package controller.rental;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
@Controller
@RequestMapping("/rental/detail")
public class RentalDetailOpenController implements FrontControllerInterface {

	
	@RequestMapping(method=RequestMethod.GET)
	public String OpenProcessGet(HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println("렌탈 디페일 오픈");
		String de = request.getParameter("detail");
		System.out.println(de);
		return "rental/rentalDetail";
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
