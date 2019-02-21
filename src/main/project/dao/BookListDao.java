package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import command.BookContractMoneyCommand;
import command.BookCountCommand;
import command.PublisherContractCommand;
import dto.BookList;

public class BookListDao {
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	List list = new ArrayList();
	
	
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
	
	public List<BookList> BookRegiList(){
		sql="select BNUM,BNAME,BPRICE,BPUBLICATION_DATE,BPAGE_NUM,BINTRODUCE,BTOC,BRENTAL_PRICE"
			+" ,BIMG_ORIGIN_NAME,BIMG_STORE_NAME,BGENRE,BISBN,BPUBLISHER_PRICE,BCONTRACT_NUM,BPUBLISHER_NUM,BHIT,r.PUBNAME as pname from BOOKLIST t join PUBLISHER r on( t.BPUBLISHER_NUM = r.PUBNO) ";
		list = jdbcTemplate.query(sql, new RowMapper<BookList>() {
			
			
			@Override
			public BookList mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				BookList booklist = new BookList();
				booklist.setBnum(rs.getString("BNUM"));
				booklist.setBname(rs.getString("BNAME"));
				booklist.setBprice(rs.getInt("BPRICE"));
				booklist.setbPublicationDate(rs.getDate("BPUBLICATION_DATE"));
				booklist.setbPageNum(rs.getInt("BPAGE_NUM"));
				booklist.setbIntroduce(rs.getString("BINTRODUCE"));
				booklist.setbToc(rs.getString("BTOC"));
				booklist.setbRentalPrice(rs.getInt("BRENTAL_PRICE"));
				booklist.setbImgOriginName(rs.getString("BIMG_ORIGIN_NAME"));
				booklist.setbImgStoreName(rs.getString("BIMG_STORE_NAME"));
				booklist.setbGenre(rs.getString("BGENRE"));
				booklist.setbIsbn(rs.getString("BISBN"));
				booklist.setbPublisherPrice(rs.getInt("BPUBLISHER_PRICE"));
				booklist.setbContractNum(rs.getInt("BCONTRACT_NUM"));
				booklist.setbPublisherNum(rs.getString("BPUBLISHER_NUM"));
				booklist.setbHit(rs.getInt("BHIT"));
				booklist.setPname(rs.getString("pname"));
					
				
				return booklist;
			}
		});
		
		
		return list;
	}
	
	
	
	
}
