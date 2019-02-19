package command;

import java.util.Date;

public class PubListCommand implements CommandTestInterface {
	
	private String pubName;
	private String pubPhone;
	private String pubNo;
	private String pubCeo;
	private Date pubCreDate;
	private Date cbContractDate;
	private Date cbExpiredDate;
	private int cbMoney;
	private int cbRoyalty;
	private String cbStatus;
	private int allBook;
	

	public String getPubName() {
		return pubName;
	}
	public PubListCommand setPubName(String pubName) {
		this.pubName = pubName;
		return this;
	}
	public String getPubPhone() {
		return pubPhone;
	}
	public PubListCommand setPubPhone(String pubPhone) {
		this.pubPhone = pubPhone;
		return this;
	}
	public String getPubNo() {
		return pubNo;
	}
	public PubListCommand setPubNo(String pubNo) {
		this.pubNo = pubNo;
		return this;
	}
	public String getPubCeo() {
		return pubCeo;
	}
	public PubListCommand setPubCeo(String pubCeo) {
		this.pubCeo = pubCeo;
		return this;
	}
	public Date getPubCreDate() {
		return pubCreDate;
	}
	public PubListCommand setPubCreDate(Date pubCreDate) {
		this.pubCreDate = pubCreDate;
		return this;
	}
	public Date getCbContractDate() {
		return cbContractDate;
	}
	public PubListCommand setCbContractDate(Date cbContractDate) {
		this.cbContractDate = cbContractDate;
		return this;
	}
	public Date getCbExpiredDate() {
		return cbExpiredDate;
	}
	public PubListCommand setCbExpiredDate(Date cbExpiredDate) {
		this.cbExpiredDate = cbExpiredDate;
		return this;
	}
	public int getCbMoney() {
		return cbMoney;
	}
	public PubListCommand setCbMoney(int cbMoney) {
		this.cbMoney = cbMoney;
		return this;
	}
	public int getCbRoyalty() {
		return cbRoyalty;
	}
	public PubListCommand setCbRoyalty(int cbRoyalty) {
		this.cbRoyalty = cbRoyalty;
		return this;
	}
	public String getCbStatus() {
		return cbStatus;
	}
	public PubListCommand setCbStatus(String cbStatus) {
		this.cbStatus = cbStatus;
		return this;
	}
	public int getAllBook() {
		return allBook;
	}
	public PubListCommand setAllBook(int allBook) {
		this.allBook = allBook;
		return this;
	}




	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub

	}

}
