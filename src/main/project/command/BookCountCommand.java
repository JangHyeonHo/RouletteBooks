package command;

import other.AutoLinePrint;

public class BookCountCommand implements CommandTestInterface {
	
	private int bookCount;
	private String pubNum;
	
	
	public int getBookCount() {
		return bookCount;
	}	
	public BookCountCommand setBookCount(int bookCount) {
		this.bookCount = bookCount;
		return this;
	}
	public String getPubNum() {
		return pubNum;
	}
	public BookCountCommand setPubNum(String pubNum) {
		this.pubNum = pubNum;
		return this;
	}
	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("북카운트 커멘드","책 번호 / 수량",pubNum + " / " + bookCount);
	}

}
