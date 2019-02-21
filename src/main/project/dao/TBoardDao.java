package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import command.TBoardDetailCommand;
import command.TBoardListCommand;
import command.TBoardWriteCommand;
import dto.TBoard;
import other.AutoLinePrint;
import other.AutoPaging;

public class TBoardDao {
	
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	List list = new ArrayList();
	
	
	@Autowired
	public TBoardDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public Integer insert(TBoard tboard,HttpServletRequest request) {
		Integer i = null;
		sql = "insert into tboard(TNUM, TUPLOADER, TKIND, TSUBJECT, TCONTENT, TMETHOD,"
				+ "TSITUATION, TREG_DATE, TBOOK_NAME, TBOOK_ORI_IMG_NAME, TBOOK_STORE_IMG_NAME,"
				+ "TPRICE, TBOOK_STATUS, TBOOK_GENRE,TPUBLISHER)"
		+ " values(tnum.nextval,?,?,?,?,?,?,sysdate,?,?,?,?,?,?,?)";		
	 	i = jdbcTemplate.update(sql,tboard.gettUploader(),tboard.gettKind(),tboard.gettSubject(),tboard.gettContent(),tboard.gettMethod(),tboard.gettSituation()[0],tboard.gettBookName(),tboard.gettBookOriImgName(),tboard.gettBookStoreImgName(),tboard.gettPrice(),tboard.gettBookStatus(),tboard.gettBookGenre(),tboard.gettBookPublisher());
	 			AutoLinePrint.println("글번호 : "+ tboard.gettNum() +" 글쓰기 처리 완료");
		
		return i;
		
	}
	
	
	
	public List<TBoardListCommand> tboardlist(AutoPaging page) {
		int minNum = ((page.getPage()-1)*page.getLimit())+1;
		int maxNum = minNum+page.getLimit()-1;
		
		
//		sql ="select TNUM,TKIND,TBOOK_STATUS,TSUBJECT,TCONTENT,TPRICE,TREG_DATE,TBOOK_STORE_IMG_NAME,TSITUATION,r.MNICKNAME from tboard t, rmember r WHERE t.TUPLOADER = r.MNO order by TNUM DESC";
		sql = "SELECT * FROM"
	+	" (SELECT rownum AS rnum, a.* FROM"
	+	" (select TNUM,TKIND,TBOOK_STATUS,TSUBJECT,TCONTENT,TPRICE,TREG_DATE,TBOOK_STORE_IMG_NAME,TSITUATION,r.MNICKNAME from tboard t join rmember r on( t.TUPLOADER = r.MNO ) order by TNUM DESC) a WHERE rownum<=?) WHERE rnum>=?" ;
		
		list = jdbcTemplate.query(sql,new TboardRowMapper(),maxNum,minNum);
	
		return list;
	}
	
	public Integer tboardlistcount() {
		Integer i = null;
		
		sql ="select count(*) as cnt from tboard";
		
	  i = jdbcTemplate.query(sql, new ResultSetExtractor<Integer>() {

		@Override
		public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
			rs.next();
			

			return rs.getInt("cnt");
		}
	} );
		return i;
	}
	
	
	
	
	public TBoardDetailCommand detail(int number) {
		System.out.println(number);
		sql ="select TNUM,TSUBJECT,TKIND,TBOOK_GENRE,r.MNICKNAME AS NICK,TPUBLISHER,TBOOK_NAME,TREG_DATE,TPRICE,TBOOK_STATUS,TMETHOD,TSITUATION,TBOOK_STORE_IMG_NAME,r.MGRADE AS grade,r.MEMAIL AS email,r.MPHONE AS phone,TCONTENT from TBOARD t JOIN RMEMBER r ON(t.TUPLOADER = r.MNO) WHERE t.TNUM=?";
		TBoardDetailCommand	detail = jdbcTemplate.query(sql, new ResultSetExtractor<TBoardDetailCommand>() {

			@Override
			public TBoardDetailCommand extractData(ResultSet rs) throws SQLException, DataAccessException {
				TBoardDetailCommand detail = new TBoardDetailCommand();
				
				if(rs.next()) {
					if(rs.getString("TBOOK_STORE_IMG_NAME")!=null) {
				String[] image = rs.getString("TBOOK_STORE_IMG_NAME").split("&");
				detail.settBookImage(image[0]);
				for(int i=0;i<image.length;i++) {
					
					detail.settBookImageSub(image);
						
						System.out.println(detail.gettBookImageSub()[i]);
					}
				System.out.println("asdf"+image.length);
					}else {
						detail.settBookImage(rs.getString("TBOOK_STORE_IMG_NAME"));
					}

				detail.settNum(rs.getInt("TNUM"));
				detail.settSubject(rs.getString("TSUBJECT"));
				detail.settContent(rs.getString("TCONTENT"));
				detail.settKind(rs.getString("TKIND"));
				detail.settBookGenre(rs.getString("TBOOK_GENRE"));
				detail.settNickName(rs.getString("NICK"));
				detail.settPublicher(rs.getString("TPUBLISHER"));
				detail.settBookName(rs.getString("TBOOK_NAME"));
				detail.settRegDate(rs.getDate("TREG_DATE"));
				detail.settPrice(rs.getInt("TPRICE"));
				detail.settBookStatus(rs.getString("TBOOK_STATUS"));
				detail.settMethod(rs.getString("TMETHOD"));
				detail.settSituation(rs.getString("TSITUATION"));
				detail.settMemberGrade(rs.getString("grade"));
				detail.settMemberPhone(rs.getString("phone"));
				detail.settMemberEmail(rs.getString("email"));
				
				
				
			
				}
				return detail;
			}
					
		} ,number);
		
		return  detail;
	}
	
	

	public Integer modify(TBoard tboard, int number) {
		Integer i = null;
		
		sql="update tboard set TSUBJECT=?,TKIND=?,TCONTENT=?,TMETHOD=?,TBOOK_NAME=?,TBOOK_ORI_IMG_NAME=?,TBOOK_STORE_IMG_NAME=?,TPRICE=?,TBOOK_STATUS=?,TBOOK_GENRE=?,TPUBLISHER=? where tnum=?";
		i = jdbcTemplate.update(sql,tboard.gettSubject(),tboard.gettKind(),tboard.gettContent(),tboard.gettMethod(),tboard.gettBookName(),tboard.gettBookOriImgName(),tboard.gettBookStoreImgName(),tboard.gettPrice(),tboard.gettBookStatus(),tboard.gettBookGenre(),tboard.gettBookPublisher(),number);
		
		return i;
	}
	
	public void delete(int number) {
		sql="delete from tboard where TNUM=?";
	    jdbcTemplate.update(sql,number);
		
		
	}
	
	 
 class TboardRowMapper implements RowMapper<TBoardListCommand>{
	public TBoardListCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
		TBoardListCommand listcommand = new TBoardListCommand();
	
		if(rs.getString("TBOOK_STORE_IMG_NAME")!=null) {
			String[] image = rs.getString("TBOOK_STORE_IMG_NAME").split("&");
			listcommand.settBookStoreImgName(image[0]);
			System.out.println("이미지 배열에 넣니?");
		}else {
			listcommand.settBookStoreImgName("TBOOK_STORE_IMG_NAME");
			System.out.println("이미지 배열에 안넣니?");
		}
		
		listcommand.settNickName(rs.getString("MNICKNAME"));
		listcommand.settNum(rs.getInt("TNUM"));
		listcommand.settKind(rs.getString("TKIND"));
		listcommand.settSubject(rs.getString("TSUBJECT"));
		listcommand.settContent(rs.getString("TCONTENT"));
		listcommand.settPrice(rs.getInt("TPRICE"));
		listcommand.settRegDate(rs.getDate("TREG_DATE"));
		listcommand.settBookStatus(rs.getString("TBOOK_STATUS"));
		listcommand.settSituation(rs.getString("TSITUATION"));
				
				return listcommand;
			}
 }


public Integer updateRequester(String getmNo) {
	// TODO Auto-generated method stub
	sql = "update into tboard set trequester = ?";
	return jdbcTemplate.update(sql,getmNo);
}

}




