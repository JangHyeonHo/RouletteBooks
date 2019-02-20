package service.tboard;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import command.TBoardDetailCommand;
import command.TBoardWriteCommand;
import dao.TBoardDao;
import dto.TBoard;
import other.AutoFileClassfication;
import other.ClassifiedFile;
import other.ContextPathRoute;

public class TBoardModifyService {
	
	TBoardDao tboarddao;
	

	@Autowired
	public TBoardModifyService(TBoardDao tboarddao) {
		this.tboarddao = tboarddao;
	}
	
	
	public TBoardDetailCommand getaction(int number) {
		
		TBoardDetailCommand tboard = tboarddao.detail(number);
		
		return tboard;
	}



	public void action(int number,HttpSession session,@ModelAttribute TBoardWriteCommand command,HttpServletRequest request) {
		  String contextPath = ContextPathRoute.route(request, "trade/uploadImage/");
		    System.out.println(contextPath);
		    ContextPathRoute.createDirectory(new File(contextPath));
		
		    ClassifiedFile file = AutoFileClassfication.ArrayFileClassficationing(command.getTrade_book_img(),contextPath);
		
		    TBoard tboard = new TBoard();
			tboard.commandChange(command);
			
//			이부분 수정함
			tboard.settBookOriImgName(file.getFileOriginName());
			tboard.settBookStoreImg_Name(file.getFileStoreName());
			
			tboard.DTOTEST();
		    
		    
		    
		tboarddao.modify(tboard,number);
		
		
	}

}
