package controller.company;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.ManagerSessionInfomationCommand;
import command.PubListCommand;
import command.PublisherContractCommand;
import controller.FrontControllerInterface;
import other.AutoAlertProcess;
import service.company.PublisherContractDetailService;

@Controller
@RequestMapping("/company/sales/publisher/contract")
public class CompanyBookContractRegistController implements FrontControllerInterface {
	//장현호
	@Autowired
	PublisherContractDetailService service;
	public void setService(PublisherContractDetailService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String OpenProcessGet(@ModelAttribute("pubNo") String pubNo, HttpSession session, Model model) {
		// TODO Auto-generated method stub
		if(session.getAttribute("managerInfo")==null || pubNo.equals("undefined")) {
			return AutoAlertProcess.alertAfterRedirect(model, "접근 에러", "잘못된 접근입니다!", "/roulettebooks/company/main");
		}
		System.out.println("출판사 계약 등록");
		System.out.println("출판사 등록 번호 : " + pubNo + "번 계약 등록진행");
		PubListCommand com = service.action(pubNo);
		if(com==null) {
			return AutoAlertProcess.alertAfterRedirect(model, "접근 에러", "잘못된 접근입니다!", "/roulettebooks/main");
		}
		
		if(com.getCbContractDate()==null || com.getCbExpiredDate().after(new Date()) ) {
			
		}
		model.addAttribute("contractDetail",com);
		return "company/Contract/BookContractRegistSystem";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String OpenProcessPost(@ModelAttribute PublisherContractCommand command, HttpSession session, Model model) {
		// TODO Auto-generated method stub
		if(session.getAttribute("managerInfo")==null) {
			return AutoAlertProcess.alertAfterRedirect(model, "계약 업로드 실패!", "다시 로그인 해 주세요", "/roulettebooks/company/login");
		}
		ManagerSessionInfomationCommand manager = (ManagerSessionInfomationCommand) session.getAttribute("managerInfo");
		command.CommandTest();
		service.UpdateProcess(command, manager.getRmno());
		return AutoAlertProcess.alertAfterRedirect(model, "계약 등록 완료", "등록 완료했습니다.", "./list");
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
