package command;

import java.util.Date;

public class PublisherContractCommand implements CommandTestInterface{

	
	private int conNum;
	private String pubName;
	private Date conDate;
	private Date expDate;
	private int royalty;
	private BookContractMoneyCommand[] books;
	
	public int getConNum() {
		return conNum;
	}

	public PublisherContractCommand setConNum(int conNum) {
		this.conNum = conNum;
		return this;
	}

	public String getPubName() {
		return pubName;
	}

	public PublisherContractCommand setPubName(String pubName) {
		this.pubName = pubName;
		return this;
	}

	public Date getConDate() {
		return conDate;
	}

	public PublisherContractCommand setConDate(Date conDate) {
		this.conDate = conDate;
		return this;
	}

	public Date getExpDate() {
		return expDate;
	}

	public PublisherContractCommand setExpDate(Date expDate) {
		this.expDate = expDate;
		return this;
	}

	public int getRoyalty() {
		return royalty;
	}

	public PublisherContractCommand setRoyalty(int royalty) {
		this.royalty = royalty;
		return this;
	}

	public BookContractMoneyCommand[] getBooks() {
		return books;
	}

	public PublisherContractCommand setBooks(BookContractMoneyCommand[] books) {
		this.books = books;
		return this;
	}

	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		
	}
	
}
