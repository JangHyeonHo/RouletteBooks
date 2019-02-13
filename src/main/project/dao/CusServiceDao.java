package dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dto.CusServiceDTO;
import other.AutoLinePrint;

public class CusServiceDao {
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	@Autowired
	public CusServiceDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	public Integer insert(CusServiceDTO cusService) {
		Integer i = null;
		sql = "insert into cusservice(csno, cskind, cssubject, cscontent,  "
				+ " csreg_date, csmailagree ) "
				+ " values(csno.nextval, ?, ?, ?, sysdate, ?)";
		i = jdbcTemplate.update(sql, cusService.getCskind(), cusService.getCsSubject(), cusService.getCsContent(), cusService.getCsMailAgree());
		AutoLinePrint.println("회원번호 : "+ cusService.getCsNo() +" 문의글 처리 완료");
		
		return i;
	}
}
