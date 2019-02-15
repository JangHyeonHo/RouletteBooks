package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.CusServiceDTO;
import other.AutoLinePrint;

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
		sql = "insert into cusservice(csno, cskind, cssubject, cscontent,  "
				+ " csreg_date, csmailagree ) "
				+ " values(csno.nextval, ?, ?, ?, sysdate, ?)";
		i = jdbcTemplate.update(sql, cusService.getCsKind(), cusService.getCsSubject(), cusService.getCsContent(), cusService.getCsMailAgree());
		AutoLinePrint.println("회원번호 : "+ cusService.getCsNo() +" 문의글 처리 완료");
		
		return i;
	}

	public List<CusServiceDTO> inquiryList() {
		// TODO Auto-generated method stub
		sql = "select CSNO, CSKIND, CSSUBJECT, CSSITUATION, CSREG_DATE from CUSSERVICE order by CSREG_DATE desc";
		list = jdbcTemplate.query(sql, new inquiryRowMapper());
		return list;
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
		return cs;
	}
}
