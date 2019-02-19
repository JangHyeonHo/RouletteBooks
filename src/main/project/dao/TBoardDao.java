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
import dto.TBoard;
import other.AutoLinePrint;

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
	
	
	
	public List<TBoardListCommand> tboardlist() {
		sql ="select TNUM,TKIND,TBOOK_STATUS,TSUBJECT,TCONTENT,TPRICE,TBOOK_STATUS,TREG_DATE,TBOOK_STORE_IMG_NAME,TSITUATION,r.MNICKNAME from tboard t, rmember r WHERE t.TUPLOADER = r.MNO order by TNUM DESC";
		 list = jdbcTemplate.query(sql,new TboardRowMapper());
		
		return list;
	}
	
	
	
	
	public TBoardDetailCommand detail(int number) {
		System.out.println(number);
		sql ="select TNUM,TSUBJECT,TKIND,TBOOK_GENRE,r.MNICKNAME AS NICK,TPUBLISHER,TBOOK_NAME,TREG_DATE,TPRICE,TBOOK_STATUS,TMETHOD,TSITUATION,TBOOK_STORE_IMG_NAME,r.MGRADE AS grade,r.MEMAIL AS email,r.MPHONE AS phone,TCONTENT from TBOARD t JOIN RMEMBER r ON(t.TUPLOADER = r.MNO) WHERE t.TNUM=?";
		TBoardDetailCommand	detail = jdbcTemplate.query(sql, new ResultSetExtractor<TBoardDetailCommand>() {

			@Override
			public TBoardDetailCommand extractData(ResultSet rs) throws SQLException, DataAccessException {
				TBoardDetailCommand detail = new TBoardDetailCommand();
				
				if(rs.next()) {
				String[] image = rs.getString("TBOOK_STORE_IMG_NAME").split("&");
				System.out.println("asdf"+image.length);

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
				detail.settBookImage(image[0]);
				for(int i=0;i<image.length;i++) {
					
				detail.settBookImageSub(image);
					
					System.out.println(detail.gettBookImageSub()[i]);
				}
				
			
				}
				return detail;
			}
					
		} ,number);
		
		return  detail;
	}
	
	

	
	
	
	
	 
 class TboardRowMapper implements RowMapper<TBoardListCommand>{
	public TBoardListCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
		TBoardListCommand listcommand = new TBoardListCommand();
		String[] image = rs.getString("TBOOK_STORE_IMG_NAME").split("&");
		
		
		listcommand.settNickName(rs.getString("MNICKNAME"));
		listcommand.settNum(rs.getInt("TNUM"));
		listcommand.settKind(rs.getString("TKIND"));
		listcommand.settSubject(rs.getString("TSUBJECT"));
		listcommand.settContent(rs.getString("TCONTENT"));
		listcommand.settPrice(rs.getInt("TPRICE"));
		listcommand.settRegDate(rs.getDate("TREG_DATE"));
		listcommand.settBookStoreImgName(image[0]);
		listcommand.settBookStatus(rs.getString("TBOOK_STATUS"));
		listcommand.settSituation(rs.getString("TSITUATION"));
				
				return listcommand;
			}
 }

}




