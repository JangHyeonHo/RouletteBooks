package dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dto.RMember;

public class MyPageDao {
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	
	@Autowired
	public MyPageDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}


	public RMember InfoConfirm(String passwordChange, String getmNo) {
		// TODO Auto-generated method stub
		RMember dto = null;
		
		
		return null;
		
		
	}
	
	
	
	
	
	
	

}
