package controller.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.CusServiceCommand;
import controller.FrontControllerInterface;
import dto.CusServiceDTO;
import other.AutoAlertProcess;
import service.cusservice.DeleteService;

@Controller
@RequestMapping("/customerservice/delete")
public class InquiryDeleteController implements FrontControllerInterface {


	private DeleteService deleteService;

	@Autowired
	public InquiryDeleteController(DeleteService deleteService) {
	this.deleteService = deleteService;
}
	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@RequestParam("csNo") int csNo, Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:문의내역 삭제");
		System.out.println("삭제번호: "+csNo);
    	deleteService.delete(csNo);
		return AutoAlertProcess.alertAfterRedirect(model, "삭제 완료", "성공적으로 삭제되었습니다", "myinquiry");
		
		
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
