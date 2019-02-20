package controller.trade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.FrontControllerInterface;
import dto.TBoard;
import other.AutoAlertProcess;
import service.tboard.TBoardDeleteService;
@Controller
@RequestMapping("/trade/delete")
public class TredaDeleteController implements FrontControllerInterface {

	
	TBoardDeleteService service;
	
	@Autowired
	public TredaDeleteController(TBoardDeleteService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute("tnum") int number,Model model) {
		
		service.action(number);
		return AutoAlertProcess.alertAfterRedirect(model,  "게시글삭제 완료",number +"게시글이 삭제되었습니다.", "../tradelist");
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
