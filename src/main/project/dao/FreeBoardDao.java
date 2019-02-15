package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.FreeBoard;
import dto.TBoard;
import other.AutoLinePrint;

public class FreeBoardDao {
   private JdbcTemplate jdbcTemplate;
   private String sql;
   List list = new ArrayList();
   @Autowired
   public FreeBoardDao(DataSource datasource) {
      this.jdbcTemplate = new JdbcTemplate(datasource);
   }

   //자유게시판 글쓰기
   public Integer insert(FreeBoard freeboard) {
      Integer i = null;
      sql = "insert into FreeBoard(fno,fmno,fsubject,fcontent,fdate)"
         + " values(fno.nextval,?,?,?,sysdate)";
      
      i= jdbcTemplate.update(sql,freeboard.getfMno(),freeboard.getfSubject(),freeboard.getfContent());
      AutoLinePrint.println("글번호 : "+ freeboard.getfNo() +" 글쓰기 처리 완료");
      return i;
   }
   //자유게시판 리스트

   public List<FreeBoard> fblist() {
      sql = "select FNO,FSUBJECT,FHIT,FDATE from FREEBOARD ORDER BY FNO DESC";
            
      list = jdbcTemplate.query(sql,new FreeBoardRowMapper() );
      return list;
   }


   

class FreeBoardRowMapper implements RowMapper<FreeBoard>{
      public FreeBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
         // TODO Auto-generated method stub
         FreeBoard freeboarddto = new FreeBoard();
         freeboarddto.setfNo(rs.getInt("FNO"));
         freeboarddto.setfSubject(rs.getString("FSUBJECT"));
         freeboarddto.setfHit(rs.getInt("FHIT"));
         freeboarddto.setfDate(rs.getDate("FDATE"));
         System.out.println("자유게시판 다오 글 넘버 확인 :" + freeboarddto.getfNo());
         return freeboarddto;
      }
   }

}