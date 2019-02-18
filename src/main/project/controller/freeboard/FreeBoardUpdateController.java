package controller.freeboard;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import dto.FreeBoard;
import service.freeboard.FreeBoardUpdateService;
@Controller
@RequestMapping("/freeboard/update")
public class FreeBoardUpdateController implements FrontControllerInterface {
	//권도완
	private FreeBoardUpdateService freeboardupdateservice;
	@Autowired
	public FreeBoardUpdateController(FreeBoardUpdateService freeboardupdateservice) {
		this.freeboardupdateservice = freeboardupdateservice;
	}
	

	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model) {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 수정 오픈");
		List<FreeBoard> FreeboardUpdate = freeboardupdateservice.Update();
		model.addAttribute("FreeboardUpdate",FreeboardUpdate);
		return "freeboard/FreeBoardUpdate";
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
