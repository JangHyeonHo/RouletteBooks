package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.validation.Errors;

import command.LoginSessionInfomationCommand;
import command.ManagerLoginCommand;
import command.ManagerSessionInfomationCommand;
import command.MemberListPageCommand;
import dto.RManager;
import other.AutoLinePrint;
import other.PasswordAutoMD5;

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

	public ManagerSessionInfomationCommand passwordConfirming(final ManagerLoginCommand command, final Errors error) {
		// TODO Auto-generated method stub
		sql = "select rmno, rmname, rmgrade, rmdepartment, rmpassword from rmanager where rmno = ?";
		command.setComPw(PasswordAutoMD5.passwordChange(command.getComPw()));
		ManagerSessionInfomationCommand sessionInfo = jdbcTemplate.query(sql, new ResultSetExtractor<ManagerSessionInfomationCommand>() {
			
			@Override
			public ManagerSessionInfomationCommand extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()) {
					if(!rs.getString("rmpassword").equals(command.getComPw())){
						System.out.println("비밀번호 불일치");
						error.rejectValue("comPw", "mismatch");
						return null;
					} 
					return new ManagerSessionInfomationCommand().setRmno(rs.getString("rmno"))
								.setRmname(rs.getString("rmname"))
								.setRmdepartment(rs.getString("rmdepartment"))
								.setRmgrade(rs.getString("rmgrade"));
					
				} else {
					System.out.println("아이디 불일치");
					error.rejectValue("comId", "mismatch");
					return null;
				}
				
			}
			
		}, command.getComId());
		
		
		return (sessionInfo==null) ? null : sessionInfo;
	}

	public List<RManager> ListCall(MemberListPageCommand command) {
		// TODO Auto-generated method stub
		sql = "select rmno, rmname, rmphone,rmbirth_date,rm_img_store_file,rmgrade,rmsalary,rmcommission,"
				+ "rmcre_date,rmdepartment from rmanager";
		return jdbcTemplate.query(sql, new RowMapper<RManager>() {

			@Override
			public RManager mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new RManager().setRmno(rs.getString("rmno"))
						.setRmname(rs.getString("rmname"))
						.setRmphone(rs.getString("rmphone"))
						.setRmbirthDate(rs.getDate("rmbirth_date"))
						.setRmImgStoreFile(rs.getString("rm_img_store_file"))
						.setRmgrade(rs.getString("rmgrade"))
						.setRmsalary(rs.getInt("rmsalary"))
						.setRmcommission(rs.getInt("rmcommission"))
						.setRmcreDate(rs.getDate("rmcre_date"))
						.setRmdepartment(rs.getString("rmdepartment"));
			}
			
		});
	}
	
	
	
	
	
}
