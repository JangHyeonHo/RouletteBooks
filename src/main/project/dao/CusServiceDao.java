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

import command.CusServiceCommand;
import dto.CusServiceDTO;
import dto.RMember;
import other.AutoLinePrint;
import other.AutoPaging;

public class CusServiceDao {
	private JdbcTemplate jdbcTemplate;
	private String sql;
	List list = new ArrayList();
	
	@Autowired
	public CusServiceDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	public Integer insert(CusServiceDTO cusService) {
		Integer i = null;
		sql = "insert into cusservice(csno, mno, cskind, CSSITUATION, cssubject, cscontent,  "
				+ " csreg_date, csmailagree ) "
				+ " values(csno.nextval, ?, ?, ?, ?, ?, sysdate, ?)";
		i = jdbcTemplate.update(sql,cusService.getmNo(), cusService.getCsKind(),cusService.getCsSituation(), cusService.getCsSubject(), cusService.getCsContent(), cusService.getCsMailAgree());
		AutoLinePrint.println("회원번호 : "+ cusService.getCsNo() +" 문의글 처리 완료");
		
		return i;
	}
	//고객센터 내문의
	public List<CusServiceDTO> inquiryList(String mno, AutoPaging ap) {
		// TODO Auto-generated method stub
		 int minNum = ((ap.getPage()-1)*ap.getLimit())+1;
	     int maxNum = minNum+ap.getLimit()-1;
	      
		sql = "select * from (select rownum as rnum, c.* from "
				+ "(select CSNO, mno, CSKIND, CSSUBJECT, CSSITUATION, CSREG_DATE, cscontent, csscore, CSANSWERCON, CSANSWER_DATE "
				+ "from CUSSERVICE where mno = ? order by CSREG_DATE desc) c where rownum <= ?) where rnum >= ?";
		
		list = jdbcTemplate.query(sql, new inquiryRowMapper(), mno,maxNum, minNum);

		return list;
	}
	//고객센터 메인
	public List<CusServiceDTO> inquiryList(String mno) {
		// TODO Auto-generated method stub
		sql = "select * from (select rownum as rnum, c.* from "
				+ "(select CSNO, mno, CSKIND, CSSUBJECT, CSSITUATION, CSREG_DATE, cscontent, csscore, CSANSWERCON, CSANSWER_DATE "
				+ "from CUSSERVICE where mno = ? order by CSREG_DATE desc) c where rownum <= 4) where rnum >= 1";
		list = jdbcTemplate.query(sql, new inquiryRowMapper(), mno);
		
		return list;
	}

	public CusServiceDTO detail(int listcsNo) {
		// TODO Auto-generated method stub
		CusServiceDTO dto = null;
		sql = "select CSNO, mno, CSKIND, CSSUBJECT, CSREG_DATE, CSSITUATION, CSCONTENT, CSSCORE, CSANSWERCON, CSANSWER_DATE from CUSSERVICE "
				+ " where csno = ? ";
		list = jdbcTemplate.query(sql, new inquiryRowMapper(), listcsNo);
		if(!list.isEmpty()) dto = (CusServiceDTO) list.get(0);
		
		return dto;
	}

	public void delete(int csNo) {
		// TODO Auto-generated method stub
		
		sql="delete from cusservice where csno = ?";
		 jdbcTemplate.update(sql, csNo);
		
		
		
	}

	public Integer listCount() {
		// TODO Auto-generated method stub
		Integer i = null;
		sql ="select count(*) as cnt from cusservice";
		
		i = jdbcTemplate.query(sql,new ResultSetExtractor<Integer>() {

			@Override
			public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				rs.next();
				
				return rs.getInt("cnt");
			}
			
		});
		return i ;
	}


	

	
}
class inquiryRowMapper implements RowMapper<CusServiceDTO>  {
	public CusServiceDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CusServiceDTO cs = new CusServiceDTO();
		
		cs.setCsNo(rs.getInt("csno"));
		cs.setCsKind(rs.getString("cskind"));
		cs.setCsSubject(rs.getString("CSSUBJECT"));
		cs.setCsSituation(rs.getString("CSSITUATION"));
		cs.setCsRegDate(rs.getDate("CSREG_DATE"));
		cs.setmNo(rs.getString("mno"));
		cs.setCsContent(rs.getString("cscontent"));
		cs.setCsScore(rs.getInt("csscore"));
		cs.setCsAnswerDate(rs.getDate("CSANSWER_DATE"));
		cs.setCsAnswerCon(rs.getString("CSANSWERCON"));
		
		return cs;
	}
}
