package dao;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dto.TBoard;
import other.AutoLinePrint;

public class TBoardDao {
	
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
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

}
