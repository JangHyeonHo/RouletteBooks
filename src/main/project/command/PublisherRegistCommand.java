package command;

import other.AutoLinePrint;

public class PublisherRegistCommand implements CommandTestInterface{
	
	private String pName;
	private String phone1;
	private String phone2;
	private String phone3;
	private String pNum;
	private String pCeo;
	
	
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getpNum() {
		return pNum;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	public String getpCeo() {
		return pCeo;
	}
	public void setpCeo(String pCeo) {
		this.pCeo = pCeo;
	}
	public String fullPhoneNum() {
		return phone1+phone2+phone3;
	}

	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("출판사 등록 커멘드 정보","출판사 명 : " + pName,"출판사 전화번호 : " + fullPhoneNum(),"출판사 사업자번호 : " + pNum,"출판사 대표자명 : " + pCeo);
		
	}

}
