package controller.freeboard;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.FreeBoardUpdateCommand;
import command.LoginSessionInfomationCommand;
import controller.FrontControllerInterface;
import dto.FreeBoard;
import service.freeboard.FreeBoardUpdateService;

//컨트롤러 명시 무조건 있어야함
@Controller

// URL맵핑 주소
@RequestMapping("/freeboard/update")
public class FreeBoardUpdateController implements FrontControllerInterface {
	//권도완
	
	//하나의 객체를 사용하기 위해  (왠만해선 필요)
	private FreeBoardUpdateService freeboardupdateservice;
	
	// xml에 등록을 먼저 해야함 
	@Autowired
	public FreeBoardUpdateController(FreeBoardUpdateService freeboardupdateservice) {
		this.freeboardupdateservice = freeboardupdateservice;
	}
	

	
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute("fno") int fno, Model model, HttpSession session) {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 수정 오픈");
		if(session.getAttribute("loginInfo") == null) {
			return "redirect:/freeboardlist";
		}
		FreeBoard freeboard = freeboardupdateservice.Update(fno, (LoginSessionInfomationCommand)session.getAttribute("loginInfo"));
		if(freeboard == null) {
			return "redirect:/freeboardlist";
		}
		model.addAttribute("freeboard",freeboard);
		
		return "freeboard/FreeBoardUpdate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute FreeBoardUpdateCommand command,Model model) {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 수정 포스트 작동");
		
		freeboardupdateservice.PostUpdate(command);
	
		return "redirect:/freeboardlist";
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
