package dto;

import java.util.Date;

import command.SignUpCommand;
import command.TBoardWriteCommand;

public class TBoard {
	private String tUploader;
	private int tNum;
	private String tKind;
	private String tSubject;
	private String tContent;
	private String tMethod;
	private String tSituation;
	private Date tRegDate;
	private String tBookName;
	private String tBookOriImgName;
	private String tBookStoreImgName;
	private int tPrice;
	private String tBookStatus;
	private String tBookGenre;
	private Date tStartDate;
	private String tDeliveryNum;
	private String tDeliveryName;
	private Date tDeliveryNumDate;
	private int tCharge;
	private String tBuyerAddr;
	
	
	
	
	
	public int gettNum() {
		return tNum;
	}




	public void settNum(int tNum) {
		this.tNum = tNum;
	}




	public String gettKind() {
		return tKind;
	}




	public void settKind(String tKind) {
		this.tKind = tKind;
	}




	public String gettSubject() {
		return tSubject;
	}




	public void settSubject(String tSubject) {
		this.tSubject = tSubject;
	}




	public String gettContent() {
		return tContent;
	}

	public String gettUploader() {
		return tUploader;
	}




	public void settUploader(String tUploader) {
		this.tUploader = tUploader;
	}




	public void settBookStoreImgName(String tBookStoreImgName) {
		this.tBookStoreImgName = tBookStoreImgName;
	}



	public void settContent(String tContent) {
		this.tContent = tContent;
	}




	public String gettMethod() {
		return tMethod;
	}




	public void settMethod(String tMethod) {
		this.tMethod = tMethod;
	}




	public String gettSituation() {
		return tSituation;
	}




	public void settSituation(String tSituation) {
		this.tSituation = tSituation;
	}




	public Date gettRegDate() {
		return tRegDate;
	}




	public void settRegDate(Date tRegDate) {
		this.tRegDate = tRegDate;
	}




	public String gettBookName() {
		return tBookName;
	}




	public void settBookName(String tBookName) {
		this.tBookName = tBookName;
	}




	public String gettBookOriImgName() {
		return tBookOriImgName;
	}




	public void settBookOriImgName(String tBookOriImgName) {
		this.tBookOriImgName = tBookOriImgName;
	}




	public String gettBookStoreImgName() {
		return tBookStoreImgName;
	}




	public void settBookStoreImg_Name(String tBookStoreImgName) {
		this.tBookStoreImgName = tBookStoreImgName;
	}




	public int gettPrice() {
		return tPrice;
	}




	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}




	public String gettBookStatus() {
		return tBookStatus;
	}




	public void settBookStatus(String tBookStatus) {
		this.tBookStatus = tBookStatus;
	}




	public String gettBookGenre() {
		return tBookGenre;
	}




	public void settBookGenre(String tBookGenre) {
		this.tBookGenre = tBookGenre;
	}




	public Date gettStartDate() {
		return tStartDate;
	}




	public void settStartDate(Date tStartDate) {
		this.tStartDate = tStartDate;
	}




	public String gettDeliveryNum() {
		return tDeliveryNum;
	}




	public void settDeliveryNum(String tDeliveryNum) {
		this.tDeliveryNum = tDeliveryNum;
	}




	public String gettDeliveryName() {
		return tDeliveryName;
	}




	public void settDeliveryName(String tDeliveryName) {
		this.tDeliveryName = tDeliveryName;
	}




	public Date gettDeliveryNumDate() {
		return tDeliveryNumDate;
	}




	public void settDeliveryNumDate(Date tDeliveryNumDate) {
		this.tDeliveryNumDate = tDeliveryNumDate;
	}




	public int gettCharge() {
		return tCharge;
	}




	public void settCharge(int tCharge) {
		this.tCharge = tCharge;
	}




	public String gettBuyerAddr() {
		return tBuyerAddr;
	}




	public void settBuyerAddr(String tBuyerAddr) {
		this.tBuyerAddr = tBuyerAddr;
	}
	
	


	public void DTOTEST() {
		System.out.println("DTO테스트 시작");
		System.out.println(tNum);
		System.out.println(tKind);
		System.out.println(tSubject);
		System.out.println(tMethod);
		System.out.println(tBookOriImgName);
		System.out.println(tBookStoreImgName);
		System.out.println(tBookName);
		System.out.println(tPrice);
		System.out.println(tBookStatus);
		System.out.println(tBookGenre);
		System.out.println("끝");
		
	}
	
	
	
	public TBoard commandChange(TBoardWriteCommand command) {
		tUploader = command.getTrade_board_nick_name();
		tKind = command.getTrade_board_horsehead();
		tSubject = command.getTrade_board_subject();
		tContent = command.getTextarea();
		tMethod = command.getTrade_method();
		tBookName = command.getTrade_book_name();
		tPrice = command.getTrade_book_price();
		tBookStatus = command.getTrade_book_status();
		tBookGenre = command.getTrade_genre();
		

		  
		  return this;
		
	}
	
}
