package service.tboard;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import command.TBoardWriteCommand;
import dao.TBoardDao;
import dto.TBoard;
import other.AutoFileClassfication;
import other.ClassifiedFile;
import other.ContextPathRoute;

public class TBoardWriteService {
	private TBoardDao tboardDao;

	@Autowired
	private TBoardWriteService(TBoardDao tboardDao) {
		this.tboardDao = tboardDao;
	}
	
	public void action(TBoardWriteCommand command,HttpServletRequest request) {
//		String path;
		
	    String contextPath = ContextPathRoute.route(request, "trade/uploadImage/");
	    System.out.println(contextPath);
	    ContextPathRoute.createDirectory(new File(contextPath));
	   
	    /* 위에걸로 대체
	     * File file = new File(contextPath);
	    if(!file.exists()) {
	    	file.mkdirs();
	    }*/
	    ClassifiedFile file = AutoFileClassfication.ArrayFileClassficationing(command.getTrade_book_img(),contextPath);
	    
	    /*위에 걸로 대체
	     * 
	     * MultipartFile[] imgArray = command.getTrade_book_img();
	      String originalFile = "";
	      String storeFileList = "";
	      for(MultipartFile img : imgArray) {
	         if(originalFile != "") {
	            originalFile += "&";
	            storeFileList += "&";
	         }
	         originalFile += img.getOriginalFilename();

	         String originalFileExtension = originalFile.substring(originalFile.lastIndexOf("."));
	         //
	         System.out.println(originalFileExtension);
	         String storeFile = UUID.randomUUID().toString().replaceAll("-", "");
	         storeFile = storeFile + originalFileExtension;

	         storeFileList += storeFile;

	         File storeFileItem = new File(contextPath+storeFile);
	         try {
	        	 img.transferTo(file);

	         } catch (Exception e) {
	            // TODO Auto-generated catch block
//	            path="report/submissionForm";
	         } 
	      }
*/
		TBoard tboard = new TBoard();
		tboard.commandChange(command);
		
//		이부분 수정함
		tboard.settBookOriImgName(file.getFileOriginName());
		tboard.settBookStoreImg_Name(file.getFileStoreName());
		
		tboard.DTOTEST();
		
		tboardDao.insert(tboard,request);
		
	}
}
