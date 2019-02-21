package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import command.BookCountCommand;
import command.PubListCommand;
import dto.Publisher;

public class PublisherDao {
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	@Autowired
	public PublisherDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public Integer publisherRegister(Publisher dto) {
		// TODO Auto-generated method stub
		sql = "insert into publisher(pubname, pubphone, pubno, pubceo, pub_cre_date) values(?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql, dto.getPubname(), dto.getPubphone(), dto.getPubno(), dto.getPubceo(), dto.getPubCreDate());
		
	}

	public List<PubListCommand> publisherList(final List<BookCountCommand> bookCnt) {
		// TODO Auto-generated method stub
		sql = "SELECT PUBNAME,PUBPHONE,PUBNO,PUBCEO,PUB_CRE_DATE," + 
				"cp.CB_CONTRACT_DATE,cp.CB_EXPIRED_DATE,cp.CB_MONEY,cp.CB_ROYALTY," + 
				"cp.CB_STATUS FROM publisher p, CONTRACT_PUBLISHER cp WHERE p.PUBNO=cp.CB_PUBLISHER_NO";
		List<PubListCommand> list = jdbcTemplate.query(sql, new RowMapper<PubListCommand>() {

			@Override
			public PubListCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				int pubCount = 0;
				for(int a = 0; a < bookCnt.size() ; a++) {
					if(rs.getString("PUBNO").equals(bookCnt.get(a).getPubNum())) {
						pubCount = bookCnt.get(a).getBookCount();
						bookCnt.get(a).CommandTest();
						break;
					}
				}
				
				return new PubListCommand().setPubName(rs.getString("PUBNAME")).setPubPhone(rs.getString("PUBPHONE")).setPubNo(rs.getString("PUBNO"))
						.setPubCeo(rs.getString("PUBCEO")).setPubCreDate(rs.getDate("PUB_CRE_DATE")).setCbContractDate(rs.getDate("CB_CONTRACT_DATE"))
						.setCbExpiredDate(rs.getDate("CB_EXPIRED_DATE")).setCbMoney(rs.getInt("CB_MONEY")).setCbRoyalty(rs.getInt("CB_ROYALTY")).setCbStatus(rs.getString("CB_STATUS")).setAllBook(pubCount);
			}
			
		});
		return list;
	}
	
	
}
