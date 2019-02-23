package service.company;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import command.BookModifyCommand;
import dao.BookListDao;
import other.AutoFileClassfication;
import other.ClassifiedFile;
import other.ContextPathRoute;

public class BookModifyService {
	@Autowired
	BookListDao dao;
	



	public void setDao(BookListDao dao) {
		this.dao = dao;
	}


	
	public BookModifyCommand getaction(int number) {
		
		BookModifyCommand modify = dao.detail(number);
		
		return modify;
	}
	
	


	public void action(int number, BookModifyCommand command,HttpServletRequest request) {
		  String contextPath = ContextPathRoute.route(request, "book/uploadImage/");
		  ContextPathRoute.createDirectory(new File(contextPath));
			
		    ClassifiedFile file = AutoFileClassfication.ArrayFileClassficationing(command.getImage(),contextPath);
		
		    command.setBookOriImgName(file.getFileOriginName());
		    command.setBookStoreImgName(file.getFileStoreName());
		    
		 dao.Modify(number,command);
		
	 }
}
