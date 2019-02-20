package service.freeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.FreeBoardDao;
import dto.FreeBoard;

public class FreeBoardListService {
   private FreeBoardDao freeboarddao;
   List<FreeBoard> freeboards;
   
   @Autowired
   public FreeBoardListService(FreeBoardDao freeboarddao) {
      this.freeboarddao = freeboarddao;
   }
   
   public List<FreeBoard> freeboardlist(){
      freeboards = freeboarddao.fblist();
      return freeboards;
   }
   
}