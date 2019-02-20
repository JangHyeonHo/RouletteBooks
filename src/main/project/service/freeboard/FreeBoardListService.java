package service.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import command.FreeBoardListPageCommand;
import dao.FreeBoardDao;
import dto.FreeBoard;
import other.AutoPaging;

public class FreeBoardListService {
   private FreeBoardDao freeboarddao;
   List<FreeBoard> freeboards;
   
   @Autowired
   public FreeBoardListService(FreeBoardDao freeboarddao) {
      this.freeboarddao = freeboarddao;
   }
   
   public List<FreeBoard> freeboardlist(AutoPaging pagin, FreeBoardListPageCommand command){
      freeboards = freeboarddao.fblist(pagin,command);
      return freeboards;
   }

public int total(FreeBoardListPageCommand command) {
	// TODO Auto-generated method stub
	
	return freeboarddao.totallist(command);
}
   
}