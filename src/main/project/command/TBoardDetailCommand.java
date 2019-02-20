package command;

import java.util.Date;

public class TBoardDetailCommand {
	private String tBookStoreImgName;
	private int tNum;
	private String tSubject;
	private String tKind;
	private String tBookGenre;
	private String tContent;
	private String tNickName;
	private String tPublicher;
	private String tBookName;
	private Date tRegDate;
	private int tPrice;
	private String tBookImage;
	private String[] tBookImageSub;
	private String tBookStatus;
	private String tMethod;
	private String tSituation;
	private String tMemberPhone;
	private String tMemberGrade;
	private String tMemberEmail;
	
	
	



	public String[] gettBookImageSub() {
		return tBookImageSub;
	}
	public void settBookImageSub(String[] tBookImageSub) {
		this.tBookImageSub = tBookImageSub;
	}
	public String gettBookImage() {
		return tBookImage;
	}
	public void settBookImage(String tBookImage) {
		this.tBookImage = tBookImage;
	}
	
	public String gettMemberPhone() {
		return tMemberPhone;
	}
	public void settMemberPhone(String tMemberPhone) {
		this.tMemberPhone = tMemberPhone;
	}
	
	public String gettKind() {
		return tKind;
	}
	public void settKind(String tKind) {
		this.tKind = tKind;
	}
	
	
	public String gettBookStoreImgName() {
		return tBookStoreImgName;
	}
	public void settBookStoreImgName(String tBookStoreImgName) {
		this.tBookStoreImgName = tBookStoreImgName;
	}
	public int gettNum() {
		return tNum;
	}
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	public String gettSubject() {
		return tSubject;
	}
	public void settSubject(String tSubject) {
		this.tSubject = tSubject;
	}
	public String gettBookGenre() {
		return tBookGenre;
	}
	public void settBookGenre(String tBookGenre) {
		this.tBookGenre = tBookGenre;
	}
	public String gettContent() {
		return tContent;
	}
	public void settContent(String tContent) {
		this.tContent = tContent;
	}
	public String gettNickName() {
		return tNickName;
	}
	public void settNickName(String tNickName) {
		this.tNickName = tNickName;
	}
	public String gettPublicher() {
		return tPublicher;
	}
	public void settPublicher(String tPublicher) {
		this.tPublicher = tPublicher;
	}
	public String gettBookName() {
		return tBookName;
	}
	public void settBookName(String tBookName) {
		this.tBookName = tBookName;
	}
	public Date gettRegDate() {
		return tRegDate;
	}
	public void settRegDate(Date tRegDate) {
		this.tRegDate = tRegDate;
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
	public String gettMemberGrade() {
		return tMemberGrade;
	}
	public void settMemberGrade(String tMemberGrade) {
		this.tMemberGrade = tMemberGrade;
	}
	public String gettMemberEmail() {
		return tMemberEmail;
	}
	public void settMemberEmail(String tMemberEmail) {
		this.tMemberEmail = tMemberEmail;
	}

	
public void CommandTest() {
	System.out.println(tSubject);
	System.out.println(tContent);
	
}
	
	
	

}