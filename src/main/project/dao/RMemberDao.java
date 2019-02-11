package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.RMember;
import other.AutoLinePrint;

public class RMemberDao {
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	@Autowired
	public RMemberDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	//아이디 만들때 데이터 입력
	public Integer insertMember(RMember member) {
		// TODO Auto-generated method stub
		Integer i = null;
		sql = "insert into RMember(mno, memail, mphone, mname, mpassword, mnickname, mbirth_date, mgender, mgrade, mcre_date, mcash, maddress, macc_num, macc_bank, mstatus)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		i = jdbcTemplate.update(sql, member.getmNo(), member.getmEmail(), member.getmPhone(), member.getmName()
				,member.getmPassword(),member.getmNickname(),member.getmBirthDate(),member.getmGender(),member.getmGrade()
				,member.getmCreDate(),member.getmCash(),member.getmAddress(),member.getmAccNum()
				,member.getmAccBank(),member.getmStatus());
		AutoLinePrint.println("회원번호 : "+ member.getmNo() +" 회원 가입 처리 완료");
		
		return i;
	}
	
	//아이디 새로 만들 때 회원번호 생성
	public String mnoCall() {
		// TODO Auto-generated method stub
		sql = "select mno, MCRE_DATE from rmember WHERE MCRE_DATE = (SELECT max(MCRE_DATE) FROM RMEMBER GROUP BY MCRE_DATE)";
		List<String> maxNo = jdbcTemplate.query(sql, new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getString("mno");
			}
			
		});
		//"A0000001"
		if(maxNo.isEmpty()) {
			maxNo.add("A0000000");
		}
		System.out.println("현재 가장 최근에 만든 회원의 회원 번호 : " + maxNo.get(0));
		int nextNo = Integer.parseInt(maxNo.get(0).substring(1))+1;
		System.out.println(nextNo);
		char alpha = maxNo.get(0).charAt(0);
		if(nextNo==10000000) {
			alpha += 1;
			nextNo = 1;
		}
		String noleng = String.valueOf(nextNo);
		while(noleng.length() != 7) {
			noleng = "0" + noleng;
		}
		System.out.println(alpha);
		
		String newMno = alpha + noleng;
		System.out.println("새롭게 부여한 회원 번호 : " + newMno);
		System.out.println("이상 완료 =======================================");
		return newMno;
	}
	
}
