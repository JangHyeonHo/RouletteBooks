package controller.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;

@Controller
@RequestMapping("/mypage/rantallist")
public class rantalListController implements FrontControllerInterface {
//이원학
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("open:대여내역");
		return "mypage/rantalList";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
