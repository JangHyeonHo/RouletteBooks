package command;

import org.springframework.web.multipart.MultipartFile;

public class TBoardWriteCommand {
	private String trade_board_nick_name; //닉네임
	private String trade_board_horsehead; //말머리
	private String trade_board_subject; //제목
	private String trade_method; //거래방법
	private String trade_genre; //도서장르
	private String trade_book_name; //도서이름
	private String trade_book_publisher; //출판사
	private int trade_book_price; // 가격
	private String trade_book_status; //도서 상태
	private MultipartFile[] trade_book_img; //도서이미지
	private String textarea; //게시글 글작성부분





	public String getTrade_board_nick_name() {
		return trade_board_nick_name;
	}





	public void setTrade_board_nick_name(String trade_board_nick_name) {
		this.trade_board_nick_name = trade_board_nick_name;
	}





	public String getTrade_board_horsehead() {
		return trade_board_horsehead;
	}





	public void setTrade_board_horsehead(String trade_board_horsehead) {
		this.trade_board_horsehead = trade_board_horsehead;
	}





	public String getTrade_board_subject() {
		return trade_board_subject;
	}





	public void setTrade_board_subject(String trade_board_subject) {
		this.trade_board_subject = trade_board_subject;
	}





	public String getTrade_method() {
		return trade_method;
	}





	public void setTrade_method(String trade_method) {
		this.trade_method = trade_method;
	}





	public String getTrade_genre() {
		return trade_genre;
	}





	public void setTrade_genre(String trade_genre) {
		this.trade_genre = trade_genre;
	}





	public String getTrade_book_name() {
		return trade_book_name;
	}





	public void setTrade_book_name(String trade_book_name) {
		this.trade_book_name = trade_book_name;
	}





	public String getTrade_book_publisher() {
		return trade_book_publisher;
	}





	public void setTrade_book_publisher(String trade_book_publisher) {
		this.trade_book_publisher = trade_book_publisher;
	}





	public int getTrade_book_price() {
		return trade_book_price;
	}





	public void setTrade_book_price(int trade_book_price) {
		this.trade_book_price = trade_book_price;
	}





	public String getTrade_book_status() {
		return trade_book_status;
	}





	public void setTrade_book_status(String trade_book_status) {
		this.trade_book_status = trade_book_status;
	}





	public MultipartFile[] getTrade_book_img() {
		return trade_book_img;
	}





	public void setTrade_book_img(MultipartFile[] trade_book_img) {
		this.trade_book_img = trade_book_img;
	}





	public String getTextarea() {
		return textarea;
	}





	public void setTextarea(String textarea) {
		this.textarea = textarea;
	}





	public void CommandTest() {
		System.out.println("중고거래 글쓰기 커맨드 객체 테스트");
		System.out.println(trade_board_nick_name);
		System.out.println(trade_board_horsehead);
		System.out.println(trade_board_subject);
		System.out.println(trade_method);
		System.out.println(trade_genre);
		System.out.println(trade_book_name);
		System.out.println(trade_book_publisher);
		System.out.println(trade_book_price);
		System.out.println(trade_book_status);
		System.out.println(textarea);
		System.out.println(trade_book_img);
		System.out.println("끝");
	}



}
