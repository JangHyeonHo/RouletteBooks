package controller.freeboard;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.FreeBoardWriteCommand;
import command.TBoardWriteCommand;
import controller.FrontControllerInterface;
@Controller
@RequestMapping("/freeboardwirte")
public class FreeBoardWriteController implements FrontControllerInterface {
	//권도완
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 글쓰기 오픈");
		return "freeboard/FreeBoardWrite";
	}

	@Override
	public String OpenProcessPost() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute FreeBoardWriteCommand command) {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 포스트 작동");
		command.CommandTest();
		return null;
	}

}
