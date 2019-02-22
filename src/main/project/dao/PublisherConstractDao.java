package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import command.PubListCommand;
import command.PublisherContractCommand;
import command.PublisherRegistCommand;
import dto.ContractPublisher;
import dto.Publisher;

public class PublisherConstractDao {
	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	@Autowired
	public PublisherConstractDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public Integer consOnRegister(Publisher dto) {
		// TODO Auto-generated method stub
		sql = "INSERT INTO CONTRACT_PUBLISHER(cbnum,CB_PUBLISHER_NO,CB_STATUS) values(sq_cbnum.nextval,?,?)";
		return jdbcTemplate.update(sql, dto.getPubno(),ContractPublisher.CONSTATUS[0]);
	}

	public PubListCommand ContractPublisher(String pubNo) {
		// TODO Auto-generated method stub
		sql = "select cbnum,cb_contract_date,cb_expired_date,cb_money,cb_royalty,cb_publisher_no,p.pubname,p.pubno "
				+ "from CONTRACT_PUBLISHER cp, publisher p where cb_publisher_no = ? and cp.cb_publisher_no = p.pubno";
		PubListCommand detail = jdbcTemplate.query(sql, new ResultSetExtractor<PubListCommand>() {

			@Override
			public PubListCommand extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()){
					return new PubListCommand().setCbNum(rs.getInt("cbnum")).setCbContractDate(rs.getDate("cb_contract_date"))
							.setCbExpiredDate(rs.getDate("cb_expired_date")).setCbMoney(rs.getInt("cb_money")).setCbRoyalty(rs.getInt("cb_royalty"))
							.setPubNo(rs.getString("cb_publisher_no")).setPubName(rs.getString("pubname")).setPubNo(rs.getString("pubno"));
				}
				return null;
			}
			
		},pubNo);
		return detail;
	}

	public Integer updateContract(PublisherContractCommand command, String mno, String status) {
		// TODO Auto-generated method stub
		sql = "update CONTRACT_PUBLISHER set cb_contract_date = ?, cb_expired_date = ?, cb_royalty = ?, cb_rmno = ?, cb_status = ?, cb_money = ? where cbnum = ?";
		
		return jdbcTemplate.update(sql, command.fullContractDate(), command.fullExpiredDate(), command.getRoyalty(), mno, status, command.getTotalContractMoney(), command.getConsNum());
		
	}

}
