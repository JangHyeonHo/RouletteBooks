package command;

import java.util.Date;

public class TBoardListCommand {
	
	
	private String tNickName;
	private int tNum;
	private String tKind;
	private String tSubject;
	private String tContent;
	private int tPrice;
	private String tBookStoreImgName;
	private String tBookStatus;
	private Date tRegDate;
	private String tSituation;


	public Date gettRegDate() {
		return tRegDate;
	}



	public String gettBookStoreImgName() {
		return tBookStoreImgName;
	}



	public void settBookStoreImgName(String tBookStoreImgName) {
		this.tBookStoreImgName = tBookStoreImgName;
	}



	public void settRegDate(Date tRegDate) {
		this.tRegDate = tRegDate;
	}

	public String gettNickName() {
		return tNickName;
	}
	public void settNickName(String tNickName) {
		this.tNickName = tNickName;
	}
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
	public void settContent(String tContent) {
		this.tContent = tContent;
	}
	public int gettPrice() {
		return tPrice;
	}
	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}
	
	public String gettSituation() {
		return tSituation;
	}

	public void settSituation(String tSituation) {
		this.tSituation = tSituation;
	}

	
	public String gettBookStatus() {
		return tBookStatus;
	}
	public void settBookStatus(String tBookStatus) {
		this.tBookStatus = tBookStatus;
	}
	
	



	



	
	
}
