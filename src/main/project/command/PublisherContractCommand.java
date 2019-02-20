package command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import other.AutoLinePrint;

public class PublisherContractCommand implements CommandTestInterface{

	
	private int consNum;
	private String consName;
	private int consYears;
	private int consMonths;
	private int consDays;
	private int expYears;
	private int expMonths;
	private int expDays;
	private int[] bookNum;
	private String[] bookName;
	private int[] bookPrice;
	private int[] contractPrice;
	private int royalty;
	
	
	public int getConNum() {
		return consNum;
	}


	public PublisherContractCommand setConNum(int conNum) {
		this.consNum = conNum;
		return this;
	}


	public String getConsName() {
		return consName;
	}


	public PublisherContractCommand setConsName(String consName) {
		this.consName = consName;
		return this;
	}


	public int getConsYears() {
		return consYears;
	}


	public PublisherContractCommand setConsYears(int consYears) {
		this.consYears = consYears;
		return this;
	}


	public int getConsMonths() {
		return consMonths;
	}


	public PublisherContractCommand setConsMonths(int consMonths) {
		this.consMonths = consMonths;
		return this;
	}


	public int getConsDays() {
		return consDays;
	}


	public PublisherContractCommand setConsDays(int consDays) {
		this.consDays = consDays;
		return this;
	}


	public int getExpYears() {
		return expYears;
	}


	public PublisherContractCommand setExpYears(int expYears) {
		this.expYears = expYears;
		return this;
	}


	public int getExpMonths() {
		return expMonths;
	}


	public PublisherContractCommand setExpMonths(int expMonths) {
		this.expMonths = expMonths;
		return this;
	}


	public int getExpDays() {
		return expDays;
	}


	public PublisherContractCommand setExpDays(int expDays) {
		this.expDays = expDays;
		return this;
	}


	public int[] getBookNum() {
		return bookNum;
	}


	public PublisherContractCommand setBookNum(int[] bookNum) {
		this.bookNum = bookNum;
		return this;
	}


	public String[] getBookName() {
		return bookName;
	}


	public PublisherContractCommand setBookName(String[] bookName) {
		this.bookName = bookName;
		return this;
	}


	public int[] getBookPrice() {
		return bookPrice;
	}


	public PublisherContractCommand setBookPrice(int[] bookPrice) {
		this.bookPrice = bookPrice;
		return this;
	}


	public int[] getContractPrice() {
		return contractPrice;
	}


	public PublisherContractCommand setContractPrice(int[] contractPrice) {
		this.contractPrice = contractPrice;
		return this;
	}


	public int getRoyalty() {
		return royalty;
	}


	public PublisherContractCommand setRoyalty(int royalty) {
		this.royalty = royalty;
		return this;
	}


	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		
		AutoLinePrint.println("계약 등록 커멘드 객체 테스트",
				"계약 번호 : " + consNum,
				"출판사 이름 : " + consName,
				"계약 일 : " + fullContractDate(),
				"계약 종료일 : " + fullExpiredDate(),
				"로열티 : " + royalty
				);
		if(bookName!= null) {
			for(String name : bookName) {
				System.out.println("책 이름 : " + name);
			}
		}	
	}
	public int getTotalContractMoney() {
		int total = 0;
		if(bookName != null) {
			for(int book : contractPrice) {
				total += book;
			}
			System.out.println("책 총 가격 : " + total);
		}
		return total;
	}
	
	
	public Date fullContractDate() {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(consYears+"-"+consMonths+"-"+consDays);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	public Date fullExpiredDate() {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(expYears+"-"+expMonths+"-"+expDays);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
	
}
