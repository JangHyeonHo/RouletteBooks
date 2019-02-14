package dto;

import java.util.Date;

import command.CusServiceCommand;

public class CusServiceDTO {

	private int csNo;			//문의번호
	private String email;		//답변받을 이메일
	private String cskind;		//문의분류
	private String csSubject;	//문의제목
	private String csContent;	//문의내용
	private String csSituation;	//문의상황
	private int csScore;		//문의점수
	private Date csRegDate;	//문의 작성일
	private String csAnswerCon;	//답변내용
	private Date csAnswerDate;	//답변 작성일
	private String csMailAgree;	//이메일이용동의
	 



	public String getCsMailAgree() {
		return csMailAgree;
	}

	public void setCsMailAgree(String csMailAgree) {
		this.csMailAgree = csMailAgree;
	}

	public int getCsNo() {
		return csNo;
	}

	public void setCsNo(int csNo) {
		this.csNo = csNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCskind() {
		return cskind;
	}

	public void setCskind(String cskind) {
		this.cskind = cskind;
	}

	public String getCsSubject() {
		return csSubject;
	}

	public void setCsSubject(String csSubject) {
		this.csSubject = csSubject;
	}

	public String getCsContent() {
		return csContent;
	}

	public void setCsContent(String csContent) {
		this.csContent = csContent;
	}

	public String getCsSituation() {
		return csSituation;
	}

	public void setCsSituation(String csSituation) {
		this.csSituation = csSituation;
	}

	public int getCsScore() {
		return csScore;
	}

	public void setCsScore(int csScore) {
		this.csScore = csScore;
	}

	public Date getCsRegDate() {
		return csRegDate;
	}

	public void setCsRegDate(Date csRegDate) {
		this.csRegDate = csRegDate;
	}

	public String getCsAnswerCon() {
		return csAnswerCon;
	}

	public void setCsAnswerCon(String csAnswerCon) {
		this.csAnswerCon = csAnswerCon;
	}

	public Date getCsAnswerDate() {
		return csAnswerDate;
	}

	public void setCsAnswerDate(Date csAnswerDate) {
		this.csAnswerDate = csAnswerDate;
	}

	public void commandChange(CusServiceCommand command) {
		// TODO Auto-generated method stub
		
		cskind = command.getKind();
		csSubject =	command.getSubject();
		csContent = command.getContent();
		email = command.getEmailNumber();
		
	}
	
	public void DTOTEST() {
		System.out.println(cskind);
		System.out.println(csSubject);
		System.out.println(csContent);
		System.out.println(email);
		System.out.println(csMailAgree);
		
	}
	
	
	
}