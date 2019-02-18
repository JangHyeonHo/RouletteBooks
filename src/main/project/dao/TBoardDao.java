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
				+ "TPRICE, TBOOK_STATUS, TBOOK_GENRE)"
		+ " values(tnum.nextval,?,?,?,?,?,?,sysdate,?,?,?,?,?,?)";		
	 	i = jdbcTemplate.update(sql,tboard.gettUploader(),tboard.gettKind(),tboard.gettSubject(),tboard.gettContent(),tboard.gettMethod(),tboard.gettSituation(),tboard.gettBookName(),tboard.gettBookOriImgName(),tboard.gettBookStoreImgName(),tboard.gettPrice(),tboard.gettBookStatus(),tboard.gettBookGenre());
	 			AutoLinePrint.println("글번호 : "+ tboard.gettNum() +" 글쓰기 처리 완료");
		
		return i;
		
	}
	
	
	
	public List<TBoard> tboardlist() {
		sql ="select TNUM,TSUBJECT,TCONTENT,TPRICE,TREG_DATE,TBOOK_STORE_IMG_NAME from tboard order by TNUM desc";
		 list = jdbcTemplate.query(sql,new TboardRowMapper());
		
		return list;
	}
	

	 
 class TboardRowMapper implements RowMapper<TBoard>{
	public TBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
		TBoard tboard = new TBoard();
			tboard.settNum(rs.getInt("TNUM"));
			tboard.settSubject(rs.getString("TSUBJECT"));
			tboard.settContent(rs.getString("TCONTENT"));
			tboard.settPrice(rs.getInt("TPRICE"));
			tboard.settRegDate(rs.getDate("TREG_DATE"));
			tboard.settBookStoreImgName(rs.getString("TBOOK_STORE_IMG_NAME"));
		System.out.println("중고게시판 다오 글 넘버 확인 :" + tboard.gettNum());
		System.out.println("중고게시판 다오 오리파일네임 :" + tboard.gettBookOriImgName());
				return tboard;
			}
 }

}




