package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import command.RentalCommand;

public class RentalDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public RentalDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	private String sql;
	List list = new ArrayList();
	
	
	public List<RentalCommand> rentalist(){
		sql="select BNAME,BPUBLISHER_PRICE,BIMG_STORE_NAME,BOOK_WRITER,p.PUBNAME as pname from booklist b join publisher p on( b.BPUBLISHER_NUM = p.PUBNO)";
		list = jdbcTemplate.query(sql, new RowMapper<RentalCommand>() {

			@Override
			public RentalCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				
				RentalCommand rental = new RentalCommand();
				System.out.println("111"+rental.getBname());
				rental.setBname(rs.getString("BNAME"));
				rental.setBookwirter(rs.getString("BOOK_WRITER"));
				rental.setBpublisherprice(rs.getInt("BPUBLISHER_PRICE"));
				rental.setPname(rs.getString("pname"));
				rental.setImage(rs.getString("BIMG_STORE_NAME"));
				System.out.println("222"+rental.getBname());
				
				
				return rental;
			}
		});
		
		
		
		return list;
	}
}
