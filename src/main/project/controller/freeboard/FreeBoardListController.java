package controller.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.FreeBoardListPageCommand;
import command.FreeBoardWriteCommand;
import controller.FrontControllerInterface;
import dto.FreeBoard;
import other.AutoPaging;
import service.freeboard.FreeBoardListService;
@Controller
@RequestMapping("/freeboardlist")
public class FreeBoardListController implements FrontControllerInterface {

   //권도완
   private FreeBoardListService freeboardlistservice;
   
   @Autowired
   public FreeBoardListController(FreeBoardListService freeboardlistservice) {
      this.freeboardlistservice = freeboardlistservice;
   }
   
   @RequestMapping(method = RequestMethod.GET)
   public String OpenProcessGet(Model model, @ModelAttribute FreeBoardListPageCommand command) {
      // TODO Auto-generated method stub
	  command.CommandTest();
	  if(command.getPage() == 0) {
		  command.setPage(1);
	  }
      System.out.println("자유게시판 오픈");
      AutoPaging pagin = new AutoPaging(command.getPage(),10,1);
      List<FreeBoard> Freeboardlist = freeboardlistservice.freeboardlist(pagin,command);
      pagin.setListCount(freeboardlistservice.total(command));
      pagin.PagingTest();
      model.addAttribute("pagin",pagin);
      model.addAttribute("Freeboardlist",Freeboardlist);
      return "freeboard/FreeBoard";
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