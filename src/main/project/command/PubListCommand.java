package command;

import java.util.Date;

import other.AutoLinePrint;

public class PubListCommand implements CommandTestInterface {
	
	private String pubName;
	private String pubPhone;
	private String pubNo;
	private String pubCeo;
	private Date pubCreDate;
	private Date cbContractDate;
	private Date cbExpiredDate;
	private int cbNum;
	private int cbMoney;
	private int cbRoyalty;
	private String cbStatus;
	private int allBook;
	private String[] bookNames;
	

	public int getCbNum() {
		return cbNum;
	}
	public PubListCommand setCbNum(int cbNum) {
		this.cbNum = cbNum;
		return this;
	}
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
	public String[] getBookNames() {
		return bookNames;
	}
	public void setBookNames(String[] bookNames) {
		this.bookNames = bookNames;
	}
	
	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("커멘드 객체 테스트","출판사 이름 : " + pubName,"출판사 전화번호 : " + pubPhone,"출판사 번호 : " + pubNo,"출판사 대표명 : " + pubCeo,"출판사 등록일 : " + pubCreDate
				,"계약일자 : " + cbContractDate,"출판사 계약종료일 : " + cbExpiredDate,"출판사 계약금 : " + cbMoney,"출판사 계약 번호 : " + cbNum,"출판사 로열티 : " + cbRoyalty,"출판사 책 상태 : " + cbStatus,"출판사 책 종류 : " + allBook);
		if(bookNames!=null) {
			for(int a = 0; a<bookNames.length; a++) {
				System.out.println("책의 종류 : " + bookNames[a]);
			}
		}
		
	}

}
