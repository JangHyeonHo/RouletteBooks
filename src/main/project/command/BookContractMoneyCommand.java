package command;

import other.AutoLinePrint;

public class BookContractMoneyCommand implements CommandTestInterface {
	
	private int bookNum;
	private String bookName;
	private int bookMoney;
	private int bookContractMoney;
	
	public String getBookName() {
		return bookName;
	}

	public BookContractMoneyCommand setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}
	
	public int getBookNum() {
		return bookNum;
	}

	public BookContractMoneyCommand setBookNum(int bookNum) {
		this.bookNum = bookNum;
		return this;
	}

	public int getBookMoney() {
		return bookMoney;
	}

	public BookContractMoneyCommand setBookMoney(int bookMoney) {
		this.bookMoney = bookMoney;
		return this;
	}

	public int getBookContractMoney() {
		return bookContractMoney;
	}

	public BookContractMoneyCommand setBookContractMoney(int bookContractMoney) {
		this.bookContractMoney = bookContractMoney;
		return this;
	}

	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("책 가등록 커멘드","도서 명 : " + bookName, "도서 정가 : " + bookMoney, "도서 계약 금액 : " + bookContractMoney);
		
	}

}
