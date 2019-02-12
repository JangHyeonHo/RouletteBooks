package dao;

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

	public Integer insert(TBoard tboard) {
		Integer i = null;
		sql = "insert into tboard(TNUM,TKIND,TSUBJECT,TCONTENT,TMETHOD,TSITUATION,TREG_DATE,TBOOK_NAME,TPRICE,TBOOK_STATUS,TBOOK_GENRE)"
		+ " values(tnum.nextval,?,?,?,?,?,sysdate,?,?,?,?)";		
	 	i = jdbcTemplate.update(sql,tboard.getTKIND(),tboard.getTSUBJECT(),tboard.getTCONTENT(),tboard.getTMETHOD(),tboard.getTSITUATION(),tboard.getTBOOK_NAME(),tboard.getTPRICE(),tboard.getTBOOK_STATUS(),tboard.getTBOOK_GENRE());
	 			AutoLinePrint.println("글번호 : "+ tboard.getTNUM() +" 글쓰기 처리 완료");
		
		return i;
		
	}

}
