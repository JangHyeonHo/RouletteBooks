package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import dto.FreeBoard;
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
      int number = 0;
      sql = "insert into FreeBoard(fno,fmno,fsubject,fhit,fcontent,fdate)"
         + " values(fno.nextval,?,?,?,?,sysdate)";
      i= jdbcTemplate.update(sql,freeboard.getfMno(),freeboard.getfSubject(),number,freeboard.getfContent());
      AutoLinePrint.println("글번호 : "+ freeboard.getfNo() +" 글쓰기 처리 완료");
      return i;
   }
 
   //게시글 상세정보
   public List<FreeBoard> detaillist(int fno){
	    /*  sql = "select fno,fmno,fsubject,fcontent,fhit,fdate from freeboard where fno = ?";*/
	   sql= "select fno,fmno,fsubject,fcontent,fhit,fdate,r.MNICKNAME AS NICK from freeboard t JOIN RMEMBER r ON(t.fmno = r.MNO) where fno=?";
	      list = jdbcTemplate.query(sql,new FreeBoardRowMapper(),fno);
	     return list;
	  }
   //조회수 증가
  public Integer detailcount(int fno) {
	 
	  sql = "update freeboard set fhit = fhit + 1 where fno = ?";
	  System.out.println("카운트 다오");
	  return jdbcTemplate.update(sql,fno);
  }
  
   //자유게시판 리스트
   public List<FreeBoard> fblist() {
      sql = "select fno,fmno,fsubject,fcontent,fhit,fdate,r.MNICKNAME AS NICK from freeboard t JOIN RMEMBER r ON(t.fmno = r.MNO) order by fno desc";
      list = jdbcTemplate.query(sql,new FreeBoardRowMapper());

      return list;
   }
   
   //게시글 수정
   public Integer Update(FreeBoard freeboard) {
	   sql = "update freeboard set fsubject = ?, fcontent = ? where fno = ?";
	  return jdbcTemplate.update(sql,freeboard.getfSubject(),freeboard.getfContent(),freeboard.getfNo());
	}
   
   //게시글 삭제
   public Integer Delete(FreeBoard freeboard) {
	   sql = "delete from FreeBoard where fno = ?";
	   return  jdbcTemplate.update(sql,freeboard.getfNo());
   }


   

class FreeBoardRowMapper implements RowMapper<FreeBoard>{
      public FreeBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
         // TODO Auto-generated method stub
         FreeBoard freeboarddto = new FreeBoard();
         freeboarddto.setfNo(rs.getInt("fno"));
         freeboarddto.setfSubject(rs.getString("fsubject"));
         freeboarddto.setfContent(rs.getString("fcontent"));
         freeboarddto.setfHit(rs.getInt("fhit"));
         freeboarddto.setfDate(rs.getDate("fdate"));
         freeboarddto.setfMno(rs.getString("fmno"));
         freeboarddto.setMnickname(rs.getString("NICK"));
         System.out.println("자유게시판 다오 글 넘버 확인 :" + freeboarddto.getfNo());
         return freeboarddto;
      }
   }

public FreeBoard detail(int fno, final String getmNo) {
	// TODO Auto-generated method stub
	sql = "select fno,fmno,fsubject,fcontent,fhit,fdate from freeboard where fno = ?";
	FreeBoard freeboard = jdbcTemplate.query(sql, new ResultSetExtractor<FreeBoard>() {

		@Override
		public FreeBoard extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			if(rs.next()) {
				if(!rs.getString("fmno").equals(getmNo)) {
					return null;
				}
				FreeBoard freeboard = new FreeBoard();
				freeboard.setfNo(rs.getInt("fno"));
				freeboard.setfSubject(rs.getString("FSUBJECT"));
				freeboard.setfContent(rs.getString("FCONTENT"));
				return freeboard;
			}else {
				return null;
			}
			
		}
		
	}, fno);
	return freeboard;
}














}