package controller.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.FreeBoardDetailCommand;
import controller.FrontControllerInterface;
import dto.FreeBoard;
import service.freeboard.FreeBoardDetailService;
@Controller
@RequestMapping("/freeboard/detail")
public class FreeBoardDetailController implements FrontControllerInterface {
//권도완
	private FreeBoardDetailService freeboarddetailservice;
	
	@Autowired
	public FreeBoardDetailController(FreeBoardDetailService freeboarddetailservice) {
		this.freeboarddetailservice = freeboarddetailservice;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(Model model, int fno) {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 디테일 오픈");
		List<FreeBoard> Freeboarddetail = freeboarddetailservice.Detaillist(fno);
		model.addAttribute("Freeboarddetail",Freeboarddetail);
		
		return "freeboard/FreeBoardDetail";
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
