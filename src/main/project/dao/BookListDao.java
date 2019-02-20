package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import command.BookContractMoneyCommand;
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
				+ "values(bk_num, ?, ? ,?, ?, ?)";
		for(BookContractMoneyCommand book : reservedList) {
			jdbcTemplate.update(sql, command.getConNum(), command.getConsName(),book.getBookName(), book.getBookContractMoney(), book.getBookMoney());
		}
		
	}
	
	
	
	
}
