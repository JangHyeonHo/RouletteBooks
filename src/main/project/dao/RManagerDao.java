package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.RManager;
import other.AutoLinePrint;

public class RManagerDao {
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	@Autowired
	public RManagerDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public String rmnoCall() {
		// TODO Auto-generated method stub
		sql = "select rmno, rmcre_date from rmanager WHERE rmcre_date = (SELECT max(rmcre_date) FROM rmanager GROUP BY rMCRE_DATE)";
		List<String> maxNo = jdbcTemplate.query(sql, new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getString("rmno");
			}
			
		});
		//"A0000001"
		if(maxNo.isEmpty()) {
			maxNo.add("00000000");
		}
		int nextNo = Integer.parseInt(maxNo.get(0))+1;
		System.out.println(nextNo);
		
		String noleng = String.valueOf(nextNo);
		while(noleng.length() != 8) {
			noleng = "0" + noleng;
		}
		String newMno = noleng;
		AutoLinePrint.println("새롭게 부여한 회원 번호 : " + newMno);
		return newMno;
		
	}

	public Integer insertManager(RManager manager) {
		// TODO Auto-generated method stub
		Integer i = null;
		sql = "insert into RManager(rmno, rmname, rmphone, rmbirth_date, rm_img_origin_file, rm_img_store_file, rmgrade, rmpassword, rmsalary, rmcommission, rmcre_date, rmdepartment)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ?, ?)";
		i = jdbcTemplate.update(sql, manager.getRmno(), manager.getRmname(), manager.getRmphone(), manager.getRmbirthDate(), manager.getRmImgOriginFile()
				, manager.getRmImgStoreFile(), manager.getRmgrade(), manager.getRmpassword(), manager.getRmcreDate(), manager.getRmdepartment());
		AutoLinePrint.println("사원 번호 : "+ manager.getRmno() +" 회원 가입 처리 완료");
		
		return i;

	}
	
	
	
	
	
}
