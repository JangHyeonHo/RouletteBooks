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

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public int getBookMoney() {
		return bookMoney;
	}

	public void setBookMoney(int bookMoney) {
		this.bookMoney = bookMoney;
	}

	public int getBookContractMoney() {
		return bookContractMoney;
	}

	public void setBookContractMoney(int bookContractMoney) {
		this.bookContractMoney = bookContractMoney;
	}

	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("책 가등록 커멘드","도서 명 : " + bookName, "도서 정가 : " + bookMoney, "도서 계약 금액 : " + bookContractMoney);
		
	}

}
