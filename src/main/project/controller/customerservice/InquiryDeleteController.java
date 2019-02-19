package controller.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.FrontControllerInterface;
import dto.CusServiceDTO;

@Controller
@RequestMapping("/customerservice/delete")
public class InquiryDeleteController implements FrontControllerInterface {


	private DeleteService deleteService;

	@Autowired
	public InquiryDeleteController(DeleteService deleteService) {
	this.deleteService = deleteService;
}
	
	public String OpenProcessGet(int listcsNo, Model model) {
		// TODO Auto-generated method stub
		System.out.println("open:문의내역 삭제");
		CusServiceDTO dto = deleteService.delete(listcsNo);
		
		model.addAttribute("dto",dto);
		
		return "redirect:/main";
		
	
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
