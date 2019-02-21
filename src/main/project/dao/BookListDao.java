package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import command.BookContractMoneyCommand;
import command.BookCountCommand;
import command.PublisherContractCommand;

public class BookListDao {
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	@Autowired
	public BookListDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public void insertReserved(List<BookContractMoneyCommand> reservedList, PublisherContractCommand command) {
		// TODO Auto-generated method stub
		sql = "insert into bookList(bnum, bcontract_num, bpublisher_num, bname, bpublisher_price, bprice) "
				+ "values(bk_num.nextval, ?, ? ,?, ?, ?)";
		for(BookContractMoneyCommand book : reservedList) {
			jdbcTemplate.update(sql, command.getConsNum(), command.getConsName(),book.getBookName(), book.getBookContractMoney(), book.getBookMoney());
		}
		
	}

	public List<BookCountCommand> getPubBookCount() {
		// TODO Auto-generated method stub
		sql = "select bpublisher_num, count(*) as cnt from bookList bl join CONTRACT_PUBLISHER on(CB_PUBLISHER_NO = bpublisher_num) GROUP BY bpublisher_num";
		return jdbcTemplate.query(sql, new RowMapper<BookCountCommand>() {

			@Override
			public BookCountCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new BookCountCommand().setPubNum(rs.getString("bpublisher_num"))
						.setBookCount(rs.getInt("cnt"));
			}
			
		});
	}
	
	
	
	
}
