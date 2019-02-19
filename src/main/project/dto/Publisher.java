package dto;

import java.util.Date;

import command.PublisherRegistCommand;
import other.AutoLinePrint;

public class Publisher implements DTOTestInterface {
	
	private String pubname;
	private String pubphone;
	private String pubno;
	private String pubceo;
	private Date pubCreDate;
	
	
	
	public String getPubname() {
		return pubname;
	}
	public void setPubname(String pubname) {
		this.pubname = pubname;
	}
	public String getPubphone() {
		return pubphone;
	}
	public void setPubphone(String pubphone) {
		this.pubphone = pubphone;
	}
	public String getPubno() {
		return pubno;
	}
	public void setPubno(String pubno) {
		this.pubno = pubno;
	}
	public String getPubceo() {
		return pubceo;
	}
	public void setPubceo(String pubceo) {
		this.pubceo = pubceo;
	}
	public Date getPubCreDate() {
		return pubCreDate;
	}
	public void setPubCreDate(Date pubCreDate) {
		this.pubCreDate = pubCreDate;
	}

	@Override
	public void DTOTEST() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("출판사 테이블 정보", "출판사명 : " + pubname,"출판사 전화번호 : " + pubphone,"출판사 발행자번호 : " + pubno,"출판사 대표자명 : " + pubceo,"출판사 등록일 : " + pubCreDate);
		
	}
	public void CommandChange(PublisherRegistCommand command) {
		// TODO Auto-generated method stub
		pubname = command.getpName();
		pubphone = command.fullPhoneNum();
		pubno = command.getpNum();
		pubceo = command.getpCeo();
		pubCreDate = new Date();
	}

}
