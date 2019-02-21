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
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import command.IdSearchCommand;
import command.LoginCommand;
import command.LoginSessionInfomationCommand;
import command.MemberListPageCommand;
import dto.RMember;
import other.AutoLinePrint;
import other.AutoPaging;

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
		sql = "select mno, MCRE_DATE from rmember WHERE MCRE_DATE in (SELECT max(MCRE_DATE) FROM RMEMBER GROUP BY MCRE_DATE)";
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

	public LoginSessionInfomationCommand passwordConfirming(final LoginCommand command, final Errors error) {
		// TODO Auto-generated method stub
		sql = "select mno, memail, mnickname, mcash, mstatus, mpassword, mgrade from rmember where memail = ?";
		LoginSessionInfomationCommand sessionInfo = jdbcTemplate.query(sql, new ResultSetExtractor<LoginSessionInfomationCommand>() {
			
			@Override
			public LoginSessionInfomationCommand extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()) {
					if(!rs.getString("mpassword").equals(command.getPassword())){
						System.out.println("비밀번호 불일치");
						error.rejectValue("password", "mismatch");
						return null;
					} 
					return new LoginSessionInfomationCommand().setmNo(rs.getString("mno"))
								.setmEmail(rs.getString("memail"))
								.setmNickname(rs.getString("mnickname"))
								.setmCash(rs.getInt("mcash"))
								.setmStatus(rs.getString("mstatus"))
								.setmGrade(rs.getString("mgrade"));
					
				} else {
					System.out.println("아이디 불일치");
					error.rejectValue("email", "mismatch");
					return null;
				}
				
			}
			
		}, command.getEmail());
		
		
		return (sessionInfo==null) ? null : sessionInfo;
	}

	public List<RMember> memberListCall(MemberListPageCommand command, AutoPaging page) {
		// TODO Auto-generated method stub
		int minNum = ((page.getPage()-1)*page.getLimit())+1;
		int maxNum = minNum+page.getLimit()-1;
		AutoLinePrint.println("최소 게시글 : " + minNum,"최대 게시글 : " + maxNum);
		String query = "";
		try {
		if(!command.getSearchSet().equals("money") && !command.getSearchSet().equals("hogu")) {
			query = " like '%" + command.getQuery() + "%'";
		} else {
			query = command.getQuery();
		}
		}catch(NullPointerException e) {
			
		}
		sql = "select * from "
				+ "(select rownum as rnum, m.* from "
				+ "(select mno, memail, mname, mnickname, mgender, "
				+ "mcre_date, mcash, macc_num, macc_bank, mgrade, "
				+ "mphone from rmember " 
				+ ((command.getSearchSet()!=null)?"where "+command.getSearchSet() + query:"") 
				+ " order by mcre_date desc) "
				+ "m where rownum<=?) where rnum>=?";
		List<RMember> memberList = jdbcTemplate.query(sql, new RowMapper<RMember>() {

			@Override
			public RMember mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				String phoneNum = rs.getString("mphone");
				phoneNum = phoneNum.substring(0, 7) + "xxxx";
				return new RMember().setmNo(rs.getString("mno"))
						.setmEmail(rs.getString("memail"))
						.setmName(rs.getString("mname"))
						.setmNickname(rs.getString("mnickname"))
						.setmGender(rs.getString("mgender"))
						.setmCreDate(rs.getDate("mcre_date"))
						.setmCash(rs.getInt("mcash"))
						.setmAccNum(rs.getString("macc_num"))
						.setmAccBank(rs.getString("macc_bank"))
						.setmGrade(rs.getString("mgrade"))
						.setmPhone(phoneNum);
			}
			
		}, maxNum, minNum);
		
		//테스트(주석처리 하기바람)
		/*for(RMember member: memberList) {
			member.DTOTEST();
		}*/
		return memberList;
	}
	
	public boolean InfoConfirm(final String passwordChange, String getmNo) {
		// TODO Auto-generated method stub
		boolean dto;
		sql= " select mpassword from Rmember where mno=?";
		dto = jdbcTemplate.query(sql, new ResultSetExtractor<Boolean>() {

			@Override
			public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()) {
					if(passwordChange.equals(rs.getString("mpassword"))) {
						return true;
					}
				}
				
				return false;
			}
			
			
		}, getmNo);
		
		
		return dto;
		
		
	}

	public String Idsearch(final IdSearchCommand command) {
		sql = "select mEmail from rmember where mphone=?";
		String search = jdbcTemplate.query(sql, new ResultSetExtractor<String>(){
		
			@Override
			public String extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				//있다 없다
			if(rs.next()) {
				return rs.getString("mEmail");
			}
			System.out.println("다르냐?");
			return null; //다르면
		}
			
		},command.getPhonenumber1()+command.getPhonenumber2()+command.getPhonenumber3());
		return search;
		
	
	}
}
