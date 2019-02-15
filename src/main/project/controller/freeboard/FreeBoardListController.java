package controller.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.FreeBoardWriteCommand;
import controller.FrontControllerInterface;
import dto.FreeBoard;
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
   public String OpenProcessGet(Model model) {
      // TODO Auto-generated method stub
      System.out.println("자유게시판 오픈");
      List<FreeBoard> Freeboardlist = freeboardlistservice.freeboardlist();
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