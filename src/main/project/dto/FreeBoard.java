package dto;

import java.util.Date;

import command.FreeBoardWriteCommand;
import command.TBoardWriteCommand;

public class FreeBoard implements DTOTestInterface {
	private int fNo; //게시판 글번호
	private String fMno; // 회원번호
    private String fSubject ; // 게시판 글제목
    private String fContent; // 게시판 글내용
    private int fHit; // 게시판 조회수
    private Date fDate ; // 등록일자

	
	public int getfNo() {
		return fNo;
	}




	public FreeBoard setfNo(int fNo) {
		this.fNo = fNo;
		return this;
	}




	public String getfMno() {
		return fMno;
	}




	public FreeBoard setfMno(String fMno) {
		this.fMno = fMno;
		return this;
	}




	public String getfSubject() {
		return fSubject;
	}




	public FreeBoard setfSubject(String fSubject) {
		this.fSubject = fSubject;
		return this;
	}




	public String getfContent() {
		return fContent;
	}




	public FreeBoard setfContent(String fContent) {
		this.fContent = fContent;
		return this;
	}




	public int getfHit() {
		return fHit;
	}




	public FreeBoard setfHit(int fHit) {
		this.fHit = fHit;
		return this;
	}




	public Date getfDate() {
		return fDate;
	}




	public FreeBoard setfDate(Date fDate) {
		this.fDate = fDate;
		return this;
	}



	@Override
	public void DTOTEST() {
		// TODO Auto-generated method stub
		System.out.println("게시판 내용  확인");
		System.out.println("게시판 글번호 : " + fNo);
		System.out.println("회원번호 : " + fMno);
		System.out.println("게시판 글제목 : " + fSubject);
		System.out.println(" 게시판 글내용 : " + fContent);
		System.out.println("게시판 조회수 : " + fHit);
		System.out.println("등록일자  : " + fDate);
		System.out.println("이상 완료=============================================");
	}
	
	
	
	public FreeBoard commandChange(FreeBoardWriteCommand command) {
		fMno = command.getmNo();
		fSubject = command.getSubject();
		fContent = command.getContent();
		


		  
		  return this;
		
	}
	

}
